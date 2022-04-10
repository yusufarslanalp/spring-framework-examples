package com.example.springsecuritybasic.controllers;

import com.example.springsecuritybasic.models.Todo;
import com.example.springsecuritybasic.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/todo" )
public class TodoController {

    @Autowired
    TodoService todoService;

    //return todos which belongs only one user
    @GetMapping("")
    public List<Todo> getTodos(){
       return todoService.findAll();

    @PostMapping("")
    public void addTodo( @RequestBody Todo todo ){
        todoService.setTodo( todo );
    }

    @PostMapping("")
    public Todo insertTodo( Todo todo ){
        return todoService.save( todo );

    }

}