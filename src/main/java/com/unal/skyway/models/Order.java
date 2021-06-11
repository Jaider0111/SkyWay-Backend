package com.unal.skyway.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;
@Document(collection="orders")
public class Order {
    @Id
    private String orderId;
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
    private List<Product> order;
    private int price;

    public Order(){}

    public Order(String orderId, String name, String address, String floorApto, int bonus, boolean creditCard, String creditCardNumber, int cvv, int month, int year, List<Product> order, int price) {
        this.orderId = orderId;
        this.name = name;
        this.address = address;
        this.floorApto = floorApto;
        this.bonus = bonus;
        this.creditCard = creditCard;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.month = month;
        this.year = year;
        this.order = order;
        this.price = price;
    }

    public Order(String orderId, String name, String address, String floorApto, int bonus, boolean creditCard, int pay, List<Product> order, int price) {
        this.orderId = orderId;
        this.name = name;
        this.address = address;
        this.floorApto = floorApto;
        this.bonus = bonus;
        this.creditCard = creditCard;
        this.pay = pay;
        this.order = order;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
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

    public List<Product> getOrder() {
        return order;
    }

    public void setOrder(List<Product> order) {
        this.order = order;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
