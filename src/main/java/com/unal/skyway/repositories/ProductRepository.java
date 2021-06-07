package com.unal.skyway.repositories;

import com.unal.skyway.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    Product findProductById(String id);
}
