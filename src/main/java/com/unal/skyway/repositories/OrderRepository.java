package com.unal.skyway.repositories;

import com.unal.skyway.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {

    Order findOrderById(String id);
    List<Order> findAllByStatus(String status);
}