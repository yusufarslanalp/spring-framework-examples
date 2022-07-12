package com.example.DataRelationsJPA.Repository;


import com.example.DataRelationsJPA.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
