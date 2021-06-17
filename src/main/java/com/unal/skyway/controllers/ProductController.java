package com.unal.skyway.controllers;

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

    @GetMapping("/api/products/ids")
    public List<String> getProductsIds(){
        return productService.getProductIds();
    }

    @GetMapping("/api/products/name")
    public List<String> getProductsByNameRegex(@RequestParam String regex){
        return productService.getProductsByNameMach(regex);
    }

    @GetMapping("/api/products/category")
    public List<String> getProductsByCatOrSubcat(@RequestParam String category, @RequestParam String subcategory){
        System.out.println(category);
        System.out.println(subcategory);
        return productService.getProductsByCatOrSubcat(category, subcategory);
    }
  
    @GetMapping("/api/getProducts")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }
}
