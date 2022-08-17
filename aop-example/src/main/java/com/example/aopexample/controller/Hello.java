package com.example.aopexample.controller;


import com.example.aopexample.service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/greet" )
public class Hello {

    @Autowired
    Message message;

    @GetMapping("")
    public String getTodos(){
        return message.getMessage( "Hello from AOP" );
    }

}
