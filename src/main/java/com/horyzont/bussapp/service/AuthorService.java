package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.AuthorDao;
import com.horyzont.bussapp.entities.AuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorDao authorDao;

    public List<AuthorEntity> get() {
        return authorDao.findAll();
    }
}
