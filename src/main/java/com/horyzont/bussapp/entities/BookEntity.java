package com.horyzont.bussapp.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    private Integer id;
    @Column(name = "title")
    private String title;
    @JoinColumn(name = "author", referencedColumnName = "id")
    @OneToOne
    private AuthorEntity author;
    @Column(name = "published_date")
    private Date published_date;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_id(AuthorEntity author) {
        this.author = author;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author_id=" + author +
                ", published_date=" + published_date +
                '}';
    }
}
