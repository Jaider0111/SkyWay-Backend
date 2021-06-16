package com.unal.skyway.controllers;

import com.unal.skyway.models.Order;
import com.unal.skyway.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})

public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/api/orders/create")
    public String create(@RequestBody Order order){
        if(orderService.getOrderById(order.getId())!=null){
            return "El pedido no se ha generado correctamente";
        }
        Order order1 = orderService.create(order);
        return order1.getId();
    }


}
