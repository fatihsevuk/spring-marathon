package com.fth;

import com.fth.controller.LoginController;
import com.fth.config.AppConfig;
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

        LoginController c1 = context.getBean(LoginController.class);
        System.out.println(c1);

    }
}
