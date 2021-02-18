package com.example.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {
    @Autowired
    BookDAO dao;

    public Collection<Book> getBooks() {
        return dao.getBooks();
    }

    public void createBook(Book b) {
        dao.createBook(b);
    }
}
