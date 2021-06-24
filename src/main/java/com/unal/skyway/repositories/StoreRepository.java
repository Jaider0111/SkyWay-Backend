package com.unal.skyway.repositories;

import com.unal.skyway.models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface StoreRepository extends MongoRepository<Store, String> {
    Store findStoreByEmail(String email);

    Store findStoreByIdentification(String identificaction);

    Store deleteStoreByEmail(String email);

    Store findStoreById(String id);

    @Query(value="{category: ?0}", fields="{_id : 1}")
    List<Store> findStoresIdsByCategory(String category);
}
