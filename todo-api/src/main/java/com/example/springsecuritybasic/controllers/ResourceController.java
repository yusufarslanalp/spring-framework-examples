package com.example.springsecuritybasic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( )
public class ResourceController {

    @GetMapping("")
    public String helloUser(){
        return "Hello User";
    }

    @RequestMapping({"/helloadmin"})
    public String helloAdmin(){
        return "Hello Admin";
    }

}