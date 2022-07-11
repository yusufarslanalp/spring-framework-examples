package com.example.DataRelationsJPA.Controller;


import com.example.DataRelationsJPA.Repository.BookRepository;
import com.example.DataRelationsJPA.model.Book;
import com.example.DataRelationsJPA.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "" )
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("add-new-book")
    public String message() {
        Photo photo = new Photo();
        photo.setUrlLarge( "large1" );
        photo.setUrlMedium( "medium1" );
        photo.setUrlSmall( "small1" );

        Book book = new Book();
        book.setTitle( "avatar" );
        book.setPhoto( photo );

        bookRepository.save( book );


        return "Hello Spring Boot...";
    }


}
