package com.unal.skyway.services;

import com.unal.skyway.models.Product;
import com.unal.skyway.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product delete(int id) {
        return productRepository.delete(id);
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }
}
