package com.fth.config;

import com.fth.controller.ProductController;
import com.fth.service.AmazonProductService;
import com.fth.service.ManningProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductController productController() {
        return new ProductController();
    }

    @Bean
    @Qualifier("amazon")
    public AmazonProductService amazonProductService() {
        return new AmazonProductService();
    }

    @Bean
    @Qualifier("manning")
    public ManningProductService manningProductService() {
        return new ManningProductService();
    }



}
