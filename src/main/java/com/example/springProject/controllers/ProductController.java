package com.example.springProject.controllers;

import com.example.springProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @Autowired
    ProductRepository productRepository;


}
