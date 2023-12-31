package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.BookEntity;
import com.horyzont.bussapp.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Integer> {

    @Query("SELECT count(1) from StudentEntity s WHERE s.email = ?1 AND s.password = ?2")
    public Integer findByMailAndPassword(String email , String password);

    @Query("SELECT s FROM StudentEntity s WHERE s.email = ?1")
    public StudentEntity findByMail(String email);


}