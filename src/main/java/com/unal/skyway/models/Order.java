package com.unal.skyway.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;
import java.util.Map;

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
    private int price;
    private String status;

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
                "price='" + price + '\''+
                '}';


    }

    public Order(String id, String name, String address, String floorApto, int bonus, boolean creditCard, String creditCardNumber, int cvv, int month, int year, int pay, Map<String, Integer> products, int price, String status, String consumerId, String businessId) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.floorApto = floorApto;
        this.bonus = bonus;
        this.creditCard = creditCard;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.month = month;
        this.year = year;
        this.pay = pay;
        this.products = products;
        this.price = price;
        this.status = status;
        this.consumerId = consumerId;
        this.businessId = businessId;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
}
