package com.example.DataRelationsJPA.Controller;

import com.example.DataRelationsJPA.Repository.CategoryRepository;
import com.example.DataRelationsJPA.model.Book;
import com.example.DataRelationsJPA.model.Category;
import com.example.DataRelationsJPA.model.Photo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping( "category" )
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping( "/all" )
    public List<Category> getAll(  ){
        return categoryRepository.findAll();
    }

    @GetMapping( "/by/id" )
    public Category getById( Long id ){
        return categoryRepository.findById( id ).get();
    }

    @PostMapping( "" )
    public Category addCategory( @RequestBody ObjectNode objectNode  ){
        JsonNode categoryJsonNode = objectNode.get("category");
        JsonNode parentIdJsonNode = objectNode.get("parentID");
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        Category category;
        Long parentId;
        try {
            category = jsonObjectMapper.treeToValue(categoryJsonNode, Category.class);
            parentId = jsonObjectMapper.treeToValue(parentIdJsonNode, Long.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        Category parent = categoryRepository.findById( parentId ).get();
        category.setParent( parent );
        categoryRepository.save( category );
        return category;
    }
}
