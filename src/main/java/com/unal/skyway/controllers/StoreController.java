package com.unal.skyway.controllers;

import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import com.unal.skyway.services.CustomStoreDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class StoreController {
    @Autowired
    private CustomStoreDetailsService storeService;

    @GetMapping("api/stores/get")
    public ResponseEntity<Store> getStore(@RequestParam String id) {
        Store u = storeService.getStoreById(id);
        u.setPassword("");
        u.setIdentification("");
        u.setProduct(new HashSet<>());
        return ResponseEntity.ok()
                .header("StatusFind", (u == null) ? "failed" : "success")
                .body(u);
    }
}
