package com.unal.skyway.controllers;

import com.unal.skyway.models.Order;
import com.unal.skyway.models.User;
import com.unal.skyway.models.Store;
import com.unal.skyway.services.CustomUserDetailsService;
import com.unal.skyway.services.CustomStoreDetailsService;
import com.unal.skyway.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})

public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public String createOrder (@RequestBody Order order){
        if(orderService.getOrderById(order.getOrderId())!=null){
            return "El pedido no se ha generado correctamente";
        }
        Order order1 = orderService.create(order);
        return order1.getOrderId();
    }


}
