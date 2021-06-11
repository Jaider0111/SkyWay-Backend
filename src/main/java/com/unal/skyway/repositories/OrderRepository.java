package com.unal.skyway.repositories;

import com.unal.skyway.models.Order;
import com.unal.skyway.models.Role;
import com.unal.skyway.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderRepository extends MongoRepository<Order,String>{
Order findByOrderID(String orderID);
}
