package com.example.clientservice.connector;

import com.example.clientservice.model.Book;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@EnableEurekaClient
@FeignClient(value = "BOOK-SERVICE", url="http://localhost:8084")
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}

//@FeignClient(name = "BOOK-SERVICE", fallback = BookServiceConnector.Fallback.class)
//public interface BookServiceConnector {
//    @GetMapping("/api/books")
//    List<Book> getAllBooks();
//}
//
//@Component
//class Fallback implements BookServiceConnector {
//    @Override
//    public List<Book> getAllBooks() {
//        return Collections.emptyList();
//    }
//}