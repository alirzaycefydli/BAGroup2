package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDao extends JpaRepository<AuthorEntity, Integer> {
}
