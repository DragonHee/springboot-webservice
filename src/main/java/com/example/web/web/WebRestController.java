package com.example.web.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    
    @GetMapping("/hi")
    public String hi(){
        return "Hi World!";
    }

}
