package com.example.DataRelationsJPA.Controller;


import com.example.DataRelationsJPA.Repository.BookRepository;
import com.example.DataRelationsJPA.Repository.CategoryRepository;
import com.example.DataRelationsJPA.model.Book;
import com.example.DataRelationsJPA.model.Category;
import com.example.DataRelationsJPA.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "" )
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @PostMapping("")
    public String saveBook( @RequestBody Book book  ) {




        bookRepository.save( book );


        return "Hello Spring Boot...";
    }

    @GetMapping
    public Book getBook( @RequestParam Long id ){
        Book b = bookRepository.findById( id ).get();
        return b;

    }

    public Category getCategory( String categoryName )
    {
        List<Category> ls = categoryRepository.findByCategory( categoryName );

        if( ls.size() == 0 )
        {
            Category c = new Category( categoryName );
            categoryRepository.save( c );
            return c;
        }
        else if( ls.size() == 1 ){
            return ls.get( 0 );
        }
        else return null;
    }


}
