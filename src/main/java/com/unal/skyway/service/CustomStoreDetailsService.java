package com.unal.skyway.service;

import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import com.unal.skyway.repository.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomStoreDetailsService {
    @Autowired
    private StoreRepository StoreRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public String autheticateStore (String email, String password){
        Store store= StoreRepository.findStoreByCorreo(email);
        if(store== null) return "incorrect email";
        return (bCryptPasswordEncoder.matches(password, store.getContrasena()))?
                "success": "failed";
    }

    public Store findStoreByIdentificacion(String identificacion) {
        return StoreRepository.findStoreByIdentificacion(identificacion);
    }

    public Store findStoreByEmail(String correo) {
        return StoreRepository.findStoreByCorreo(correo);
    }

    public Store saveStore(Store store) {
        store.setContrasena(bCryptPasswordEncoder.encode(store.getContrasena()));
        return StoreRepository.save(store);
    }
    public  Store deleteStoreByEmail(String store){
        return StoreRepository.deleteStoreByCorreo(store);
    }


}
