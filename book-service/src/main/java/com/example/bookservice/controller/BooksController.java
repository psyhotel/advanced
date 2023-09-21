package com.example.bookservice.controller;


import lombok.AllArgsConstructor;
import com.example.bookservice.model.Book;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bookservice.service.BookService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/books")
@Log4j2
public class BooksController {

    @Autowired
    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        log.error("hue mae");
        return bookService.getAllBooks();
    }


}



//@GetMapping("/1")
//    public String test(){
//        return "test book service";
//    }
//
//    @PostMapping
//    public void saveBook(@RequestBody Book book){
//        bookService.save(book);
//    }