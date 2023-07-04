package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<TeacherEntity, Integer> {
    @Query("SELECT count(1) from TeacherEntity s WHERE s.email = ?1 AND s.password = ?2")
    public Integer findByMailAndPassword(String email , String password);

    @Query("SELECT s FROM TeacherEntity s WHERE s.email = ?1")
    public TeacherEntity findByMail(String email);
}