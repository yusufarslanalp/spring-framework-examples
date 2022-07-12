package com.example.DataRelationsJPA.Repository;

import com.example.DataRelationsJPA.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public List<Category> findByCategory( String category );

}
