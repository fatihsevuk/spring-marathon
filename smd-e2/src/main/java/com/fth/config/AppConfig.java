package com.fth.config;


import com.fth.controller.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fth.controller")
public class AppConfig {

}
