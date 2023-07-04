package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.StudentDao;
import com.horyzont.bussapp.dao.SubjectDao;
import com.horyzont.bussapp.entities.StudentEntity;
import com.horyzont.bussapp.entities.SubjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    SubjectDao subjectDao;

    public void subscribe(Integer id){
        SubjectEntity entity = new SubjectService();
        entity.setId(id);
        subjectDao.delete(entity);
    }
}
