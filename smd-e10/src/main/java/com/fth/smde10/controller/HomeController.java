package com.fth.smde10.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // tels spring mcv ,this is a controller class
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
