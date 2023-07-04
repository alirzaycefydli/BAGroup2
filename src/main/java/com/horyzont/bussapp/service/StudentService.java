package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.AuthorDao;
import com.horyzont.bussapp.dao.BookDao;
import com.horyzont.bussapp.dao.BorrowDao;
import com.horyzont.bussapp.dao.StudentDao;
import com.horyzont.bussapp.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //login-
    // logout-register-reset password-delete account- remind password-get grade

    @Autowired
    StudentDao studentDao;

    public boolean login(String mail, String password){
        Integer count = studentDao.findByMailAndPassword(mail, password);
        if (count ==1){
            return true;
        }else {
            return false;
        }
    }

    public StudentEntity register(String first_name, String last_name, String email, String password, String login){
        StudentEntity entity = new StudentEntity();
        entity.setFirst_name(first_name);
        entity.setLast_name(last_name);
        entity.setEmail(email);
        entity.setPassword(password);
        entity.setLogin(login);
        studentDao.save(entity);
        return entity;
    }


}
