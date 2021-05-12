package com.unal.skyway.controllers;

import com.unal.skyway.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unal.skyway.models.Product;

import java.util.List;
import java.util.Map;

public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/API/Products/Create")
    @PostMapping
    public String create(@RequestBody String n,
                         @RequestBody String d,
                         @RequestBody boolean isCoun,
                         @RequestBody int a,
                         @RequestBody float p,
                         @RequestBody boolean isCust,
                         @RequestBody Map<String, List<String>> o,
                         @RequestBody List<String> imgs) {
        Product product = new Product(n, d, isCoun, p, isCust, imgs);
        if (product.isCountable) product.setAmount(a);
        if (product.isCustomizable) product.setOptions(o);

        productService.create(product);
        return "redirect:/Create";
    }
}
