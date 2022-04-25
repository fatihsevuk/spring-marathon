package com.fth.config;

import com.fth.controller.ProductController;
import com.fth.service.AmazonProductService;
import com.fth.service.ManningProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fth.*")
public class AppConfig {

}
