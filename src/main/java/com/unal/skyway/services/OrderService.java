package com.unal.skyway.services;

import com.unal.skyway.models.Order;
import com.unal.skyway.models.Product;
import com.unal.skyway.repositories.OrderRepository;
import com.unal.skyway.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order create(Order order){
        return orderRepository.save(order);
    }

    public Order getOrderById(String orderId){
        return orderRepository.findByOrderID(orderId);
    }
}
