package com.cloudschool.myfirstapi.controllers;

import com.cloudschool.myfirstapi.model.Orders;
import com.cloudschool.myfirstapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders/all")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }
}
