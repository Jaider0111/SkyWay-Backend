package com.unal.skyway.repositories;

import com.unal.skyway.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


    Product findProductById(String id);
}
