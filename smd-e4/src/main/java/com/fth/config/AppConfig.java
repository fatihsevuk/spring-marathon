package com.fth.config;

import com.fth.controller.ProductController;
import com.fth.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    ProductController productController1() {
        return new ProductController(productService());
    }

    @Bean
    ProductController productController2() {
        return new ProductController(productService());
    }

    @Bean
    ProductService productService() {
        return new ProductService();
    }

}
