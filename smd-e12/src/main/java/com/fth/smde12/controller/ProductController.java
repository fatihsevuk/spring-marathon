package com.fth.smde12.controller;


import com.fth.smde12.entity.Product;
import com.fth.smde12.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping
    public List<Product> findAllProduct() {
        return productService.getAllProduct();
    }
}
