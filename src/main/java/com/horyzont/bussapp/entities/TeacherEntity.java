package com.horyzont.bussapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class TeacherEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "login")
    private String login;
}
