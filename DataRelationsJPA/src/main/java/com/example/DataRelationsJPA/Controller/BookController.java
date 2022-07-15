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
@RequestMapping( "book" )
public class BookController {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @PostMapping("save")
    public String saveBook( @RequestBody Book book  ) {

        System.out.println( "fdsfsdf" );



        bookRepository.save( book );

        return "Hello Spring Boot...";
    }

    @GetMapping( "get/by/id" )
    public Book getBook( @RequestParam Long id ){
        Book b = bookRepository.findById( id ).get();
        return b;

    }

    @GetMapping( "get/all" )
    public List<Book> getAllBooks(  ){
        return bookRepository.findAll();

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
