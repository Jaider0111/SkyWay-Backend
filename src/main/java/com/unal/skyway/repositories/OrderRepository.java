package com.unal.skyway.repositories;

import com.unal.skyway.models.Order;
import com.unal.skyway.models.Role;
import com.unal.skyway.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {

    Order findOrderById(String id);
    List<Order> findOrdersByBusinessId(String businessId);
    List<Order> findOrdersByConsumerId(String consumerId);
}
