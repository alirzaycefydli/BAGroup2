package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.AuthorEntity;

import java.util.List;

public interface AuthorDao {
    public void create(AuthorEntity authorEntity);
    public AuthorEntity getById(Integer id);
    public List<AuthorEntity> getAll();
}
