package com.unal.skyway.controllers;

import com.unal.skyway.models.User;
import com.unal.skyway.models.Store;
import com.unal.skyway.services.CustomUserDetailsService;
import com.unal.skyway.services.CustomStoreDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})


public class LoginController {
    @Autowired
    private CustomUserDetailsService serviceUser;
    @Autowired
    private CustomStoreDetailsService serviceStore;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @GetMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestParam String email, @RequestParam String password){
        Map<String, Object> autenticado = serviceUser.autheticateUser(email, password);
        return ResponseEntity.ok()
                .body(autenticado);
    }

    @PostMapping("/registration/user")
    public String registrationUser (@RequestBody User user){
        if ( serviceUser.findUserByIdentification ( user.getIdentification() ) != null ){
            return "La identificacion ya se encuentra registrado" ;
        }
        if ( serviceUser.findUserByEmail ( user.getEmail() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        if ( serviceStore.findStoreByEmail ( user.getEmail() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        User user1 = serviceUser.saveUser(user);
        return user1.first_name;
    }

    @PostMapping("/registration/store")
    public String registrationStore (@RequestBody Store store){
        if ( serviceStore.findStoreByIdentificacion ( store.getIdentification() ) != null ){
            return "La identificacion ya se encuentra registrado" ;
        }
        if ( serviceUser.findUserByEmail ( store.getEmail() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        if ( serviceStore.findStoreByEmail ( store.getEmail()) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        store.setProduct(Collections.emptySet());
        Store store1 = serviceStore.saveStore(store);
        return store1.name;
    }

    @DeleteMapping("/login")
    public String delete(@RequestParam String email){
        User user= serviceUser.findUserByEmail(email);
        if ( user != null ) {
            user = serviceUser.deleteUserByEmail(email);
        }
        Store store = serviceStore.findStoreByEmail(email);
        if ( store != null ){
            store= serviceStore.deleteStoreByEmail(email);
        }
        if ( user == null && store == null){
            return "null";
        }
        else if ( user != null ){
            return user.getIdentification();
        }
        else{
            return store.getIdentification();
        }
    }





}
