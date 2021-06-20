package com.unal.skyway.services;

import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import com.unal.skyway.repositories.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomStoreDetailsService {
    @Autowired
    private StoreRepository StoreRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public String autheticateStore (String email, String password){
        Store store= StoreRepository.findStoreByEmail(email);
        if(store== null) return "incorrect email";
        return (bCryptPasswordEncoder.matches(password, store.getPassword()))?
                "success": "failed";
    }

    public Store findStoreByIdentificacion(String identification) {
        return StoreRepository.findStoreByIdentification(identification);
    }

    public Store findStoreByEmail(String correo) {
        return StoreRepository.findStoreByEmail(correo);
    }

    public Store saveStore(Store store) {
        store.setPassword(bCryptPasswordEncoder.encode(store.getPassword()));
        return StoreRepository.save(store);
    }
    public  Store deleteStoreByEmail(String store){
        return StoreRepository.deleteStoreByEmail(store);
    }

    public Store getStoreById(String id) {return StoreRepository.findStoreById(id);}

    public List<String> getByCategory(String category){
        return StoreRepository.findStoresIdsByCategory(category)
                .stream()
                .map(Store::getId)
                .collect(Collectors.toList());
    }
}
