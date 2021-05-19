package com.unal.skyway.repositories;

import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StoreRepository extends MongoRepository<Store, String> {
    Store findStoreByEmail(String email);
    Store findStoreByIdentification(String identificaction);
    Store deleteStoreByEmail(String email);
}
