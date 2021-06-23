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
        StringBuilder name = new StringBuilder();
        for(char i : regex.toCharArray()){
            name.append(".*").append(i);
        }
        name.append(".*");
        List<Product> products = productRepository.findIdByNameMatchesRegex(name.toString());
        return products.stream().map(Product::getId).collect(Collectors.toList());
    }

    public List<Product> getProducts() {return productRepository.findAll();}

    public List<String> getProductsByCatOrSubcat(String category, String subcategory) {
        List<Product> products;
        if (subcategory.equals(""))
            products = productRepository.findIdsByCategory(category);
        else
            products = productRepository.findIdsByCategoryAndSubcategory(category, subcategory);
        return products.stream().map(Product::getId).collect(Collectors.toList());
    }

    public List<String> getProductsByBusinessId(String businessId) {
        List<Product> products = productRepository.findIdsByBusinessId(businessId);
        return products.stream().map(Product::getId).collect(Collectors.toList());
    }

    public String deleteProductById(String id) {
        boolean ans = productRepository.existsById(id);
        if (ans) {
            productRepository.deleteProductById(id);
            return "success";
        }else
            return "error";
    }

    public Product updateProduct(Product p) {
        boolean ans = productRepository.existsById(p.getId());
        if (ans)
            return productRepository.save(p);
        else return null;
    }
}
