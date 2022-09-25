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
    @ResponseBody
    public int addNumbers(@RequestParam int a,@RequestParam int b){
        return a + b;
    }
}
