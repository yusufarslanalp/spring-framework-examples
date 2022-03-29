package com.example.springsecuritybasic.controllers;

import com.example.springsecuritybasic.models.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/todo" )
public class TodoController {

    @GetMapping("")
    public List<Todo> todos(){


    }

    @RequestMapping({"/helloadmin"})
    public String helloAdmin(){
        return "Hello Admin";
    }

}