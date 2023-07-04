package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<TeacherEntity, Integer> {
}