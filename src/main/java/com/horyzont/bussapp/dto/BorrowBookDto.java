package com.horyzont.bussapp.dto;

public class BorrowBookDto {
    private Integer bookId;
    private Integer studentId;

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
