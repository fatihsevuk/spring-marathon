package com.fth;

import com.fth.config.AppConfig;
import com.fth.controller.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        // IOC -> DI , Aspects
        // var context  = new ClassPathXmlApplicationContext();
        // var context  = new FileSystemXmlApplicationContext();

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        LoginController c1 = context.getBean("loginController1",LoginController.class);
        LoginController c2 = context.getBean("loginController2",LoginController.class);

        System.out.println(c1);
        System.out.println(c2);

    }
}
