package com.horyzont.bussapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.horyzont.bussapp.dao.BookDao;
import com.horyzont.bussapp.dao.AuthorDao;
import com.horyzont.bussapp.dao.SubjectDao;
import com.horyzont.bussapp.model.TeacherDao;
import com.horyzont.bussapp.service.microblogService;


public class microblogServiceImpl implements microblogService {
    @Autowired    BookDao BookDao;
    @Autowired    AuthorDao authorDao;
    @Autowired    SubjectDao subjectDao;
    @Autowired    TeacherDao TeacherDao;
    @Override    public List<TeacherEntity> getAllteacherFromSubject(SubjectEntity subjecEntity) {
        return TeacherDao.getAllteachers(Teacher.getId());
    }
}
