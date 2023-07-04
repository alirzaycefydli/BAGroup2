package com.horyzont.bussapp.controller;

import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.entities.StudentEntity;
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

    @GetMapping("/register/{first_name}/{last_name}/{email}/{password}/{login}")
    public StudentEntity register(@PathVariable String first_name, @PathVariable String last_name, @PathVariable String email, @PathVariable String password, @PathVariable String login) {
        return studentService.register(first_name,last_name,email,password,login);
    }

    @GetMapping("/deleteAccount/{id}")
    public void login(@PathVariable Integer id) {
        studentService.deleteAccount(id);
    }
    @GetMapping("/remindPassword/{email}")
    public String remindPassword(@PathVariable String email) {
        return studentService.remindPassword(email);
    }

    @GetMapping("/resetPassword/{email}/{password}/{newPassword}")
    public String remindPassword(@PathVariable String email, @PathVariable String password, @PathVariable String newPassword) {
         return studentService.resetPassword(email,password,newPassword);
    }
}
