package com.unal.skyway.controller;

import com.unal.skyway.models.User;
import com.unal.skyway.models.Store;
import com.unal.skyway.service.CustomUserDetailsService;
import com.unal.skyway.service.CustomStoreDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private CustomUserDetailsService serviceUser;
    @Autowired
    private CustomStoreDetailsService serviceStore;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password){
        String autenticado = serviceUser.autheticateUser(email, password);
        return autenticado;
    }
    @PostMapping("/registration/user")
    public String registrationUser (@RequestBody User user){
        if ( serviceUser.findUserByIdentificacion ( user.getIdentificacion() ) != null ){
            return "La identificacion ya se encuentra registrado" ;
        }
        if ( serviceUser.findUserByEmail ( user.getCorreo() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        if ( serviceStore.findStoreByEmail ( user.getCorreo() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        User user1 = serviceUser.saveUser(user);
        return user1.getNombres();
    }

    @PostMapping("/registration/store")
    public String registrationStore (@RequestBody Store store){
        if ( serviceStore.findStoreByIdentificacion ( store.getIdentificacion() ) != null ){
            return "La identificacion ya se encuentra registrado" ;
        }
        if ( serviceUser.findUserByEmail ( store.getCorreo() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        if ( serviceStore.findStoreByEmail ( store.getCorreo() ) != null ){
            return "El correo ya se encuentra registrado" ;
        }
        Store store1 = serviceStore.saveStore(store);
        return store1.getNombre();
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
            return user.getIdentificacion();
        }
        else{
            return store.getIdentificacion();
        }
    }





}
