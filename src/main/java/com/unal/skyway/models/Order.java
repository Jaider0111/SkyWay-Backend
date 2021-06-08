package com.unal.skyway.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    private String status;
    private String[] products;
    private Float total;
    private Date date;

    private String consumerId;
    private String businessId;

    public Order() {

    }

    public Order(String status, String[] products, Float total, Date date,
                 String consumerId, String businessId) {

        this.status = status;
        this.products = products;
        this.total = total; // may be calculated with a for loop instead
        this.date = date;

        this.consumerId = consumerId;
        this.businessId = businessId;
    }

    public String getId() { return id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String[] getProducts() { return products; }
    public void setProducts(String[] products) { this.products = products; }

    public Float getTotal() { return total; }
    public void setTotal(Float total) { this.total = total; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getConsumerId() { return consumerId; }
    public void setConsumerId(String consumerId) { this.consumerId = consumerId; }

    public String getBusinessId() { return businessId; }
    public void setBusinessId(String businessId) { this.businessId = businessId; }

}
