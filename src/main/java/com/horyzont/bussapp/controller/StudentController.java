package com.horyzont.bussapp.controller;

import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;


    @GetMapping("/login/{email}/{password}")
    public boolean login(@PathVariable String email, @PathVariable String password) {
        return studentService.login(email,password);
    }

}
