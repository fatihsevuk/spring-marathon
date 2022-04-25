package com.fth;

import com.fth.config.AppConfig;
import com.fth.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        var context= new AnnotationConfigApplicationContext(AppConfig.class);

        var productController1= context.getBean("productController1",ProductController.class);
        var productController2= context.getBean("productController2", ProductController.class);

        System.out.println(productController1);
        System.out.println(productController2);


        System.out.println(productController1.getProductService());
        System.out.println(productController2.getProductService());


    }
}
