package com.spring.boot.learning.springboot.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/get")
    public String helloWorld(){
        return "Still learning SpringBoot";
    }
}
