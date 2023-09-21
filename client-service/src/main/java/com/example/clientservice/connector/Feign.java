package com.example.clientservice.connector;


import com.example.clientservice.model.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@FeignClient(name = "book-service")
@CircuitBreaker(name = "book-service", fallbackMethod = "fallback")
public interface Feign {
    @GetMapping("/api/books")
    List<Book> getAllBooks();

    static List<Book> fallback(Throwable ex) {
        final Logger log = LogManager.getLogger(Feign.class);
        log.info( ex.getMessage());
        return Collections.emptyList();
    }
}
