package com.horyzont.bussapp.service;



import com.horyzont.bussapp.entities.TeacherEntity;
import com.horyzont.bussapp.entities.SubjectEntity;
import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.entities.BookEntity;
import java.util.List;



public interface microblogService {

    List<TeacherEntity> getAllteacherFromSubject(SubjectEntity subjecEntity);
    List<BookEntity> getAllbookFromauthor(AuthorEntity authorEntity);

}
