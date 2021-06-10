package com.unal.skyway.services;

import com.unal.skyway.models.Product;
import com.unal.skyway.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getProductIds() {
        List<Product> products = productRepository.findId();
        return products.stream().map(Product::getId).collect(Collectors.toList());
    }

    public List<String> getProductsByNameMach(String regex){
        String name = "";
        for(char i : regex.toCharArray()){
            name += ".*" + i;
        }
        name += ".*";
        List<Product> products = productRepository.findIdByNameMatchesRegex(name);
        return products.stream().map(Product::getId).collect(Collectors.toList());
    }

    public List<Product> getProducts() {return productRepository.findAll();}
}
