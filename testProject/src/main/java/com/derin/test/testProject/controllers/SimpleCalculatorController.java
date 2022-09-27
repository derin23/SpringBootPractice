package com.derin.test.testProject.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController {

    @GetMapping("/add")
    public int addNumbers(int a, int b){
        return  a + b;
    }

    @GetMapping("/sub")
    public int subtractNumbers(int a, int b){
        return a - b;
    }

    @GetMapping("/multi")
    public int multiplyNumbers(int a, int b){
        return a * b;
    }

    @GetMapping("/div")
    public int divideNumbers(int a, int b){
        return a / b;
    }
}
