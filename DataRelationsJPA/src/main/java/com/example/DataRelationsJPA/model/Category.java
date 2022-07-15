package com.example.DataRelationsJPA.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String category;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @JsonIgnore
    @OneToMany(mappedBy = "parent")
    private Collection<Category> children;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Collection<Book> books;

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Collection<Category> getChildren() {
        return children;
    }

    public void setChildren(Collection<Category> children) {
        this.children = children;
    }
}