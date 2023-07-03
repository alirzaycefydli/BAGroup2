package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.BookDao;
import com.horyzont.bussapp.entities.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public List<BookEntity> get() {
        return bookDao.findAll();
    }
}
