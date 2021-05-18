package com.unal.skyway.repository;

import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StoreRepository extends MongoRepository<Store, String> {
    Store findStoreByCorreo(String correo);
    Store findStoreByIdentificacion(String identificacion);
    Store deleteStoreByCorreo(String correo);
}
