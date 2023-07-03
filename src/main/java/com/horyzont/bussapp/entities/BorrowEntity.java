package com.horyzont.bussapp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "borrows")
public class BorrowEntity {
    @Id
    private Integer id;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @OneToOne
    private StudentEntity student_id;
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @OneToOne
    private BookEntity book_id;
    @Column(name = "borrow_date")
    private Date borrow_date;
    @Column(name = "return_date")
    private Date return_date;
    @Column(name = "status")
    private Boolean status;
}
