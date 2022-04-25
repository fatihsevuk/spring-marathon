package com.fth.controller;


import com.fth.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ProductController {

    private final ProductService productService;
    private final ApplicationContext context; // to fix sitation 1

    public ProductController(ProductService productService, ApplicationContext context) {
        this.context = context;
        System.out.println("ProductController created");
        this.productService = productService;
    }




    public ProductService getProductService() {
        // sitation 1
        // return productService;

        // to fix sitation 1
        return context.getBean(ProductService.class);
    }

}
