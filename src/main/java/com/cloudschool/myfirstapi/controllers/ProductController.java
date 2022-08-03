package com.cloudschool.myfirstapi.controllers;

import com.cloudschool.myfirstapi.model.Product;
import com.cloudschool.myfirstapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
