package com.fth;

import com.fth.config.AppConfig;
import com.fth.controller.DemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        var c= new AnnotationConfigApplicationContext(AppConfig.class);
        var controller= c.getBean(DemoController.class);

        System.out.println(controller.getClass());
        controller.doubleValue(10);

        var result = controller.intValue(15);

        System.out.println(result);
    }
}
