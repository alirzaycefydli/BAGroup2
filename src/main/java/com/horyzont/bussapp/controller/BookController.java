package com.horyzont.bussapp.controller;

import com.horyzont.bussapp.entities.BookEntity;
import com.horyzont.bussapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/getAll")
    public List<BookEntity> getAll() {
        return bookService.get();
    }
}