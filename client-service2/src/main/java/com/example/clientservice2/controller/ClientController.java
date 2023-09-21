package com.example.clientservice2.controller;


import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/client/test")
@AllArgsConstructor
public class ClientController {
//    @Autowired
//    private final ClientService clientService;

//    @GetMapping("/books")
//    public List<Book> getAllBooks(){
//        return clientService.getAllBooks();
//    }

    @GetMapping("/books")
    public String getAllBooks() {
        return "XXX";
    }
}