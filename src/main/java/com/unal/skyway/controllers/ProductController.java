package com.unal.skyway.controllers;

import com.unal.skyway.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.unal.skyway.models.Product;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/api/products/create")
    public String create(@RequestBody Product product) {
        Product p = productService.create(product);
        return p.getId();
    }
    @GetMapping("/api/products/id")
    public Product getProduct(@RequestParam String id) {
        Product p = productService.getProductById(id);
        return p;
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
        return productService.getProductsByCatOrSubcat(category, subcategory);
    }

    @GetMapping("/api/products/businessId")
    public List<String> getProductsByBusinessId(@RequestParam String businessId){
        return productService.getProductsByBusinessId(businessId);
    }
  
    @GetMapping("/api/getProducts")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }

    @DeleteMapping("/api/products")
    public String deleteProduct(@RequestParam String id) {
        if(productService.deleteProductById(id).equals("success"))
            return id;
        else return null;
    }

    @PutMapping("/api/products")
    public String updateProduct(@RequestBody Product p) {
        Product p1 = productService.updateProduct(p);
        if(p1 != null) return p1.getId();
        else return null;
    }
}
