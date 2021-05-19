package com.unal.skyway.controllers;

import com.unal.skyway.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unal.skyway.models.Product;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/api/products/create")
    public String create(@RequestBody Product product) {
        Product p = productService.create(product);
        return p.getId();
    }

}