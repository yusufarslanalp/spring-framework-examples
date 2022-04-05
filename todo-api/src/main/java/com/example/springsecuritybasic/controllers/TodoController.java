package com.example.springsecuritybasic.controllers;

import com.example.springsecuritybasic.models.Todo;
import com.example.springsecuritybasic.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/todo" )
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("")
    public List<Todo> todos(){
        return todoService.getTodos();

    }

    @RequestMapping({"/helloadmin"})
    public String helloAdmin(){
        return "Hello Admin";
    }

}