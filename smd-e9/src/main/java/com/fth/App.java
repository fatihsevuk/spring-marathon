package com.fth;

import com.fth.config.AppConfig;
import com.fth.controller.ProductController;
import com.fth.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // When application context created, spring create all the singletone beans eagerly
        // When we use @Lazy annotation on top of the Bean , this makes bean lazy instanitiated
        // this means the bean create when it requested via getBean or something else

        // Situation 1
        // when we inject a prototype object to a singletone
        // evertime singletone created, our prototype object created only once
        // to fix this in singletone object we can use ApplicationContext
        var context= new AnnotationConfigApplicationContext(AppConfig.class);

        var p1= context.getBean(ProductController.class);
        var p2= context.getBean(ProductController.class);
        var p3= context.getBean(ProductController.class);

        System.out.println(p1.getProductService());
        System.out.println(p2.getProductService());
        System.out.println(p3.getProductService());


        // Sitaution 2
        /*var s1= context.getBean(ProductService.class);
        var s2= context.getBean(ProductService.class);

        System.out.println(s1);
        System.out.println(s2);*/

    }
}
