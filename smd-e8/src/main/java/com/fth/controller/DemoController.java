package com.fth.controller;

import org.springframework.stereotype.Component;

@Component
public class DemoController {

    public void doubleValue(int x) {
        System.out.println(2*x);
    }

    public int intValue(int x) {
        return 2*x;
    }
}
