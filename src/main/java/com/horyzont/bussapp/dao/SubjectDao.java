package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.SubjectEntity;

import java.util.List;

public interface SubjectDao {
    public void create(SubjectEntity subjectentity);
    public SubjectEntity getsubjectByStudentId(Integer id);
    public SubjectEntity getsubjectById(Integer id);
    public List<SubjectEntity> getAll();
}