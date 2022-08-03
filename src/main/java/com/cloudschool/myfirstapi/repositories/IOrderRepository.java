package com.cloudschool.myfirstapi.repositories;

import com.cloudschool.myfirstapi.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IOrderRepository extends CrudRepository<Orders,Integer> {
    public List<Orders> findAll();
}
