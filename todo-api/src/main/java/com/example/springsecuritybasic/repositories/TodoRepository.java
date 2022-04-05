package com.example.springsecuritybasic.repositories;


import com.example.springsecuritybasic.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

    List<Todo> findByuserId(Long userid );

}
