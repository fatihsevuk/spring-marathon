package com.fth;

import com.fth.config.AppConfig;
import com.fth.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        var context= new AnnotationConfigApplicationContext(AppConfig.class);

        ProductController controller = context.getBean(ProductController.class);


    }
}
