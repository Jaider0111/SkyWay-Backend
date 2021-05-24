package com.unal.skyway.services;

import com.unal.skyway.models.Product;
import com.unal.skyway.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(String id) {return productRepository.findProductById(id);}
}
