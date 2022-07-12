package com.example.DataRelationsJPA.Controller;

import com.example.DataRelationsJPA.Repository.CategoryRepository;
import com.example.DataRelationsJPA.model.Book;
import com.example.DataRelationsJPA.model.Category;
import com.example.DataRelationsJPA.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "" )
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;



}
