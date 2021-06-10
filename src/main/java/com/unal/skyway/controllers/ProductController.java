package com.unal.skyway.controllers;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.unal.skyway.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.unal.skyway.models.Product;

import java.util.List;

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

    @GetMapping("/api/products")
    public ResponseEntity<Product> getProduct(@RequestParam String id) {
        Product p = productService.getProductById(id);
        return ResponseEntity.ok()
                .header("StatusFind", (p == null) ? "failed" : "success")
                .body(p);
    }

    @GetMapping("/api/getProducts")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }

}
