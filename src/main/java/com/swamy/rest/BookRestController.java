package com.swamy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swamy.model.Book;
import com.swamy.repository.BookRepository;

import lombok.SneakyThrows;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/list")
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

}
