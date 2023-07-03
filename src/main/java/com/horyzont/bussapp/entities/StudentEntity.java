package com.horyzont.bussapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    private Integer id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "login")
    private String login;
}
