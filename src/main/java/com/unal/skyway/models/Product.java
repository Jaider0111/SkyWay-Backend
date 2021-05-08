package com.unal.skyway.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.List;

@Document(collection = "products")
public class Product {

    @Id
    private int id;
    private String name;
    private String desc;
    public boolean isCountable;
    private int amount;
    private float price;
    public boolean isCustomizable;
    private Map<String, List<String>> options;
    private List<String> images;

    public Product(String n, String d, boolean isCoun, float p, boolean isCust, List<String> imgs) {
        this.name = n;
        this.desc = d;
        this.isCountable = isCoun;
        this.price = p;
        this.isCustomizable = isCust;
        this.images = imgs;
    }

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }

    public String getDesc() { return desc; }
    public void setDesc(String d) { this.desc = d; }

    public int getAmount() { return amount; }
    public void setAmount(int a) { this.amount = a; }

    public float getPrice() { return price; }
    public void setPrice(float p) { this.price = p; }

    public Map<String, List<String>> getOptions() { return options; }
    public void setOptions(Map<String, List<String>> o) { this.options = o; }

    public List<String> getImages() { return images; }
    public void setImages(List<String> imgs) { this.images = imgs; }
}


