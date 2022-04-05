package com.example.springsecuritybasic.services;

import com.example.springsecuritybasic.models.MyUser;
import com.example.springsecuritybasic.models.Todo;
import com.example.springsecuritybasic.repositories.TodoRepository;
import com.example.springsecuritybasic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Autowired
    UserRepository userRepository;

    public List<Todo> getTodos(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();



        MyUser user = userRepository.findByUsername( username );
        return todoRepository.findByuserId( user.getId() );

    }


}
