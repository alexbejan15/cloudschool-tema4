package com.cloudschool.myfirstapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello";
    }
}
