package com.cloudschool.myfirstapi.service;

import com.cloudschool.myfirstapi.model.Orders;
import com.cloudschool.myfirstapi.repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    List<Orders> list = new ArrayList<>();

    public List<Orders> getAllOrders(){
        List<Orders> aux = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    };
}
