package com.example.bookservice.service;


import lombok.AllArgsConstructor;
import com.example.bookservice.model.Book;
import org.springframework.stereotype.Service;
import com.example.bookservice.repository.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
