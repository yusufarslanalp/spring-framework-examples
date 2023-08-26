package com.example.onlyendpoint;


import model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greet")
    public String greet(  ){
        return "Hello World";

    }

    @GetMapping("/product")
    public Product product( ){
        return new Product(1L, "Samsung 256 GB Mobile Phone", 1000L);
    }

}
