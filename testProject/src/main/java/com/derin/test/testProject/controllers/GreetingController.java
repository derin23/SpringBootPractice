package com.derin.test.testProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting(){

        return "Hello from Derin!!";
    }

    @GetMapping("/add")
    public String addNumbers(@RequestParam String a,@RequestParam String b){
        return a + b;
    }
}
