package com.cloudschool.myfirstapi.service;

import com.cloudschool.myfirstapi.model.Product;
import com.cloudschool.myfirstapi.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepository productRepository;

    List<Product> list = new ArrayList<>();

    public List<Product> getAllProducts(){
        List<Product> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    };
}
