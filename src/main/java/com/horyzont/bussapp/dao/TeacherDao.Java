package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.TeacherEntity;

import java.util.List;

public interface TeacherDao {
    public void create(TeacherEntity teacherEntity);
    public TeacherEntity getteacherById(Integer id);
    public TeacherEntity getsubjectBySubject(Integer id);
    public List<TeacherEntity> getAll();
}