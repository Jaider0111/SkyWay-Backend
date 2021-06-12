package com.unal.skyway.controllers;

import com.unal.skyway.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.unal.skyway.models.User;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class ConsumerController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/consumers/get")
    public ResponseEntity<User> getUser(@RequestParam String id) {
        User u = userService.getUserById(id);
        return ResponseEntity.ok()
                .header("StatusFind", (u == null) ? "failed" : "success")
                .body(u);
    }
}
