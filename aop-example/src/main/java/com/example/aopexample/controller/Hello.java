package com.example.aopexample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/greet" )
public class Hello {
    @GetMapping("")
    public String getTodos(){
        return "Hello AOP";
    }

}
