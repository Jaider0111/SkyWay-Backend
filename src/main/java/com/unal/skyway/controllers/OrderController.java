package com.unal.skyway.controllers;

import com.unal.skyway.models.Order;
import com.unal.skyway.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/api/orders/create")
    public String create(@RequestBody Order order) {
        Order o = orderService.create(order);
        return o.getId();
    }

    @PostMapping("/api/orders/update")
    public String setStatus(String id, String status) {
        Order o = orderService.setStatus(id, status);
        return o.getId();
    }

    @GetMapping("/api/orders/get")
    public List<Order> getAllPaid(String businessId) {
        List<Order> orders = orderService.getAllPaid(businessId);
        return orders;
    }
}