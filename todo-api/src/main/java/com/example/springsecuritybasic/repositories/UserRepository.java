package com.example.springsecuritybasic.repositories;


import com.example.springsecuritybasic.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}