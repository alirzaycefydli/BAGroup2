package com.horyzont.bussapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "borrows")
public class BorrowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @OneToOne
    private StudentEntity student;
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @OneToOne
    private BookEntity book;
    @Column(name = "borrow_date")
    private String borrow_date;
    @Column(name = "return_date")
    private String return_date;
    @Column(name = "status")
    private Boolean status;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudent_id(StudentEntity student) {
        this.student = student;
    }

    public void setBook_id(BookEntity book) {
        this.book = book;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public StudentEntity getStudent_id() {
        return student;
    }

    public BookEntity getBook() {
        return book;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public Boolean getStatus() {
        return status;
    }
}
