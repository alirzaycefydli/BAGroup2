package com.horyzont.bussapp.controller;

import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/getAll")
    public List<AuthorEntity> getAll() {
        return authorService.get();
    }
}