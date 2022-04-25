package com.fth.controller;


import com.fth.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ProductController {

    @Autowired
    //@Qualifier("amazon")
    private ProductService productService;

}
