package com.cloudschool.myfirstapi.repositories;

import com.cloudschool.myfirstapi.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Integer> {
    public void delete(Product product);
}
