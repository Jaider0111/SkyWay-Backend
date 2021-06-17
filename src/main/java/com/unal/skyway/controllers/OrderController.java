package com.unal.skyway.controllers;

import com.unal.skyway.models.Order;
import com.unal.skyway.models.Store;
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

    @PutMapping("/api/orders/update")
    public String setStatus(@RequestBody Order order) {
        Order o = orderService.setStatus(order);
        return o.getId();
    }

    @GetMapping("/api/orders/get")
    public List<Order> getAllPaid(@RequestParam String businessId, @RequestParam String consumerId) {
        List<Order> orders;
        if (!businessId.equals(""))
            orders = orderService.getAllPaid(businessId);
        else
            orders = orderService.getOrdersByUser(consumerId);
        return orders;
    }
}