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

    //login-logout-register-reset password-delete account- remind password-get grade

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


}
