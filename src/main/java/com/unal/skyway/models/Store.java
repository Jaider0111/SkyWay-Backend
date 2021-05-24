package com.unal.skyway.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;


public class Store {

    @Id
    public String id;
    public String identification;
    public String name;
    public String password;
    public String category;
    public String[] schedule;
    public String phone;
    public String email;
    public String address;
    @DBRef
    public Set<Product> product;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public Store() {}

    public Store(String identification, String name, String password, String category, String[] schedule, String phone, String email, String address, Set<Product> product) {
        this.identification = identification;
        this.name = name;
        this.password = password;
        this.category = category;
        this.schedule = schedule;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id='" + id + '\'' +
                ", identification='" + identification + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", category='" + category + '\'' +
                ", schedule=" + Arrays.toString(schedule) +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", product=" + product.toString() +
                '}';
    }

}