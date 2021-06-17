package com.unal.skyway.services;

import com.unal.skyway.models.Order;
import com.unal.skyway.models.Store;
import com.unal.skyway.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order create(Order order){
        return orderRepository.save(order);
    }

    public Order getOrderById(String orderId) {
        return orderRepository.findOrderById(orderId);
    }


    public Order setStatus(Order o) {
        Order order = orderRepository.findOrderById(o.getId());
        order.setStatus(o.getStatus());
        return orderRepository.save(order);
    }

    public List<Order> getAllPaid(String businessId) {
        // return orderRepository.findAll(Sort.by(Sort.Direction.DESC, "date"));
        return orderRepository.findOrdersByStatusAndBusinessId("paid", businessId);
    }

    public List<Order> getOrdersByUser(String consumerId) {
        return orderRepository.findOrdersByConsumerId(consumerId);
    }
}
