package com.example.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {
    @Autowired
    BookRepository repo;

    public Collection<Book> getBooks() {
        return repo.findAll();
    }

    public void createBook(Book b) {
        repo.insert(b);
    }
}
