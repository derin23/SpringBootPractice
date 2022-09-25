package com.derin.test.testProject.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting(){

        return "Hello from Derin!!";
    }

}
