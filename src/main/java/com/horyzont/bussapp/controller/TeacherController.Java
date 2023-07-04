package com.horyzont.bussapp.controller;

import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.entities.TeacherEntity;
import com.horyzont.bussapp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;


    @GetMapping("/login/{email}/{password}")
    public boolean login(@PathVariable String email, @PathVariable String password) {
        return teacherService.login(email,password);
    }

    @GetMapping("/register/{first_name}/{last_name}/{email}/{password}/{login}")
    public TeacherEntity register(@PathVariable String first_name, @PathVariable String last_name, @PathVariable String email, @PathVariable String password, @PathVariable String login) {
        return teacherService.register(first_name,last_name,email,password,login);
    }

    @GetMapping("/deleteAccount/{id}")
    public void login(@PathVariable Integer id) {
        teacherService.deleteAccount(id);
    }
    @GetMapping("/remindPassword/{email}")
    public String remindPassword(@PathVariable String email) {
        return teacherService.remindPassword(email);
    }

    @GetMapping("/resetPassword/{email}/{password}/{newPassword}")
    public String remindPassword(@PathVariable String email, @PathVariable String password, @PathVariable String newPassword) {
         return teacherService.resetPassword(email,password,newPassword);
    }
}