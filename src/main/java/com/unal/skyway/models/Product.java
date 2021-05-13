package com.unal.skyway.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.List;

@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    public boolean isCountable;
    private int amount;
    private float price;
    public boolean isCustomizable;
    private Map<String, List<String>> options;
    private List<String> images;

    public Product() {

    }

    public Product(String name, String description, boolean isCountable, float price, boolean isCustomizable, List<String> images) {
        this.name = name;
        this.description = description;
        this.isCountable = isCountable;
        this.price = price;
        this.isCustomizable = isCustomizable;
        this.images = images;
    }

    public Product(String name, String description, boolean isCountable, int amount, float price, boolean isCustomizable, Map<String, List<String>> options, List<String> images) {
        this.name = name;
        this.description = description;
        this.isCountable = isCountable;
        this.amount = amount;
        this.price = price;
        this.isCustomizable = isCustomizable;
        this.options = options;
        this.images = images;
    }

    public String getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDesc() { return description; }
    public void setDesc(String description) { this.description = description; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public Map<String, List<String>> getOptions() { return options; }
    public void setOptions(Map<String, List<String>> options) { this.options = options; }

    public List<String> getImages() { return images; }
    public void setImages(List<String> images) { this.images = images; }
}


