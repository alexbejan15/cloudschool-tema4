package com.cloudschool.myfirstapi.service;

import com.cloudschool.myfirstapi.model.Customer;
import com.cloudschool.myfirstapi.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    ICustomerRepository customerRepository;

    List<Customer> list = new ArrayList<>();

    public List<Customer> getAllCustomers(){
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    };

}
