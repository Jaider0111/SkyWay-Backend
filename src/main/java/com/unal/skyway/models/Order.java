package com.unal.skyway.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Map;
import java.util.Date;

@Document(collection="orders")
public class Order {
    @Id
    private String id;
    private String name;
    private String address;
    private String floorApto;
    private int bonus;
    private boolean creditCard;
    private String creditCardNumber;
    private int cvv;
    private int month;
    private int year;
    private int pay;
    private Map<String, Integer> products;
    private int total;
    private String status;
    private Date date;

    private String consumerId;
    private String businessId;

    @Override
    public String toString(){
        return "Order{"+
                "orderId='" + id + '\''+
                "name='" + name + '\''+
                "address='" + address + '\''+
                "floorApto='" + floorApto + '\''+
                "bonus='" + bonus + '\''+
                "withCreditCard='" + creditCard + '\''+
                "creditCardNumber='" + creditCardNumber + '\''+
                "cvv='" + cvv + '\''+
                "month='" + month + '\''+
                "year='" + year + '\''+
                "pay='" + pay + '\''+
                "products='" + products.toString() + '\''+
                "price='" + total + '\''+
                '}';


    }
  
    public Order(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFloorApto() {
        return floorApto;
    }

    public void setFloorApto(String floorApto) {
        this.floorApto = floorApto;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public boolean isCreditCard() {
        return creditCard;
    }

    public void setCreditCard(boolean creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
    
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}
