package com.unal.skyway.controller;

import com.unal.skyway.repository.UserRepository;
import com.unal.skyway.service.CustomUserDetailsService;
import com.unal.skyway.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;


@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})

public class LoginController {
    @Autowired
    private CustomUserDetailsService service;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password){
        String autenticado = service.autheticate(email, password);
        return autenticado;
    }
    @PostMapping("/login")
    public String registration (@RequestBody User user){
        User user1 = service.saveUser(user);
        return user1.getNombres();
    }
    @DeleteMapping("/login")
    public User deleteUser(@RequestParam String email){
        User user= service.deleteUserByEmail(email);
        return user;

    }





}
