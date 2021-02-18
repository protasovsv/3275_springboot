package com.example.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class Controller {
    @Autowired
    private BookService service;

    @GetMapping
    public Collection<Book> getBooks() {
        return service.getBooks();
    }

    @PostMapping
    public void createBook(@RequestBody Book book) {
        service.createBook(book);
    }
}
