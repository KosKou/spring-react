package com.koskou.springserver.Controller;

import com.koskou.springserver.Entity.Book;
import com.koskou.springserver.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookService;

    @GetMapping("/books1")
    @CrossOrigin("http://localhost:3000")
    public List<Book> listBooks(){
        return bookService.findAll();
    }
}
