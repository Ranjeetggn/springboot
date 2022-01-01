package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String index(){
        return "we have successfully used Spring init";
    }

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "Welome to Spring Boot";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello to Spring Boot";
    }
}
