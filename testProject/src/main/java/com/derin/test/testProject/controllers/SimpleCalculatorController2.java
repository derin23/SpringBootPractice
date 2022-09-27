package com.derin.test.testProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController2 {

    @GetMapping("/add1")
    public int add(int a, int b){
        return a + b;
    }
    @GetMapping("/sub1")
    public int sub(int a, int b){
        return a - b;
    }
    @GetMapping("/multi1")
    public int multi(int a, int b){
        return a * b;
    }
    @GetMapping("/div1")
    public int div(int a, int b){
        return a / b;
    }

}
