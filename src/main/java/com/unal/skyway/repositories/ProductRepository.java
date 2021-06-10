package com.unal.skyway.repositories;

import com.unal.skyway.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findProductById(String id);

    @Query(value="{}", fields="{_id : 1}")
    List<Product> findId();

    @Query(value="{name: RegExp(?0, 'i')}", fields="{_id : 1}")
    List<Product> findIdByNameMatchesRegex(String regex);

}
