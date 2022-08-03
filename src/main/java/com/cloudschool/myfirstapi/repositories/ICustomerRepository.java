package com.cloudschool.myfirstapi.repositories;

import com.cloudschool.myfirstapi.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

    public Customer getByCustomerId(String customerId);

}
