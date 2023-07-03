package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.BookEntity;

import java.util.List;

public interface BookDao {
    public void create(BookDao bookEntity);
    public BookDao getBookById(Integer id);
    public BookDao getBookByAuthorId(Integer id);
    public BookDao getBookBySubjectId(Integer id);
    public List<BookDao> getAll();
}