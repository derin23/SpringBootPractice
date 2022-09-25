package com.derin.test.testProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController {

    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b){
        return  a + b;
    }

    @GetMapping("/sub")
    public int subtractNumbers(@RequestParam int a, @RequestParam int b){
        return a - b;
    }

    @GetMapping("/multi")
    public int multiplyNumbers(@RequestParam int a, @RequestParam int b){
        return a * b;
    }

    @GetMapping("/div")
    public int divideNumbers(@RequestParam int a, @RequestParam int b){
        return a / b;
    }
}
