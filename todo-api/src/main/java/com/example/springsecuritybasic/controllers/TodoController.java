package com.example.springsecuritybasic.controllers;

import com.example.springsecuritybasic.models.Todo;
import com.example.springsecuritybasic.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public void addTodo( @RequestBody Todo todo ){
        todoService.setTodo( todo );
    }

    @RequestMapping({"/helloadmin"})
    public String helloAdmin(){
        return "Hello Admin";
    }

}