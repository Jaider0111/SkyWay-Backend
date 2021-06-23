package com.unal.skyway.controllers;

import com.unal.skyway.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.unal.skyway.models.User;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ConsumerController {
    @Autowired
    private CustomUserDetailsService userService;

    @GetMapping("/api/consumers/get")
    public ResponseEntity<User> getUser(@RequestParam String id) {
        User u = userService.getUserById(id);
        u.setPassword("");
        u.setIdentification("");
        return ResponseEntity.ok()
                .header("StatusFind", (u == null) ? "failed" : "success")
                .body(u);
    }
    @PutMapping("api/users/update")
    public User update(@RequestBody User user){
        return userService.updateUser(user);
    }
}
