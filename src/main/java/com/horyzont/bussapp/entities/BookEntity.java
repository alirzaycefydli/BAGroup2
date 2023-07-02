package com.horyzont.bussapp.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "title")
    private String title;
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @OneToOne
    private AuthorEntity author_id;
    @Column(name = "login")
    private Date published_date;
}
