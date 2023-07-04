package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer> {
    @Query("SELECT b from BookEntity b WHERE b.author.id = ?1")
    public List<BookEntity> findByAuthorId(Integer authorId);
}
