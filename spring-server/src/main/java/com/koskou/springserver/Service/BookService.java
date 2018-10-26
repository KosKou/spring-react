package com.koskou.springserver.Service;

import com.koskou.springserver.Entity.Book;
import com.koskou.springserver.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> findOne(Long id){
        return bookRepository.findById(id);
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public void delete(Long id){
        bookRepository.deleteById(id);
    }
}
