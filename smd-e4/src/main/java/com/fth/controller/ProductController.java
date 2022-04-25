package com.fth.controller;


import com.fth.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ProductController {

    // @Autowired field injection is not recommended
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct() {
        productService.addProduct();
    }

    public ProductService getProductService() {
        return productService;
    }
}
