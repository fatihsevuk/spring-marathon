package com.fth;

import com.fth.config.AppConfig;
import com.fth.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        var c= new AnnotationConfigApplicationContext(AppConfig.class);

        var p= c.getBean(ProductService.class);
    }
}
