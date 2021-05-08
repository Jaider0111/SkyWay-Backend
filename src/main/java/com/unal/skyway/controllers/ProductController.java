package com.unal.skyway.controllers;

import com.unal.skyway.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unal.skyway.models.Product;

import java.util.List;
import java.util.Map;

public class ProductController {

    @Autowired
    ProductRepository productRepository;


    @RequestMapping("/Create")
    @PostMapping
    public String create(@RequestParam String n,
                         @RequestParam String d,
                         @RequestParam boolean isCoun,
                         @RequestParam int a,
                         @RequestParam float p,
                         @RequestParam boolean isCust,
                         @RequestParam Map<String, List<String>> o,
                         @RequestParam List<String> imgs) {
        Product product = new Product(n, d, isCoun, p, isCust, imgs);
        if (product.isCountable) product.setAmount(a);
        if (product.isCustomizable) product.setOptions(o);

        productRepository.save(product);
        return "redirect:/Create";
    }
}
