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
    private String category;
    private String subcategory;
    private String description;
    public boolean isCountable;
    private int amount;
    private float price;
    public boolean isCustomizable;
    private Map<String, List<String>> options;
    private List<String> images;

    private String businessId;

    public Product() {

    }

    public Product(String name, String category, String subcategory,
                   String description, boolean isCountable, float price,
                   boolean isCustomizable, List<String> images, String businessId) {

        this.name = name;
        this.category = category;
        this.subcategory = subcategory;
        this.description = description;
        this.isCountable = isCountable;
        this.price = price;
        this.isCustomizable = isCustomizable;
        this.images = images;

        this.businessId = businessId;
    }

    public Product(String name, String category, String subcategory,
                   String description, boolean isCountable, int amount,
                   float price, boolean isCustomizable, Map<String,
                   List<String>> options, List<String> images, String businessId) {

        this.name = name;
        this.category = category;
        this.subcategory = subcategory;
        this.description = description;
        this.isCountable = isCountable;
        this.amount = amount;
        this.price = price;
        this.isCustomizable = isCustomizable;
        this.options = options;
        this.images = images;

        this.businessId = businessId;
    }

    public String getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getSubcategory() { return subcategory; }
    public void setSubcategory(String subcategory) { this.subcategory = subcategory; }

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


    public String getBusinessId() { return businessId; }
    public void setBusinessId(String images) { this.businessId = businessId; }
}


