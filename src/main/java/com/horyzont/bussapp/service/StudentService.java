package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.StudentDao;
import com.horyzont.bussapp.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

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

    public void deleteAccount(Integer id){
        StudentEntity entity = new StudentEntity();
        entity.setId(id);
        studentDao.delete(entity);
    }

    public String remindPassword(String email){
        StudentEntity entity = studentDao.findByMail(email);
        System.out.println(entity.getPassword());
        return entity.getPassword();
    }

    public String resetPassword(String email, String password, String newPassword){
        StudentEntity entity = studentDao.findByMail(email);
        if (entity.getPassword().equals(password)){
            entity.setPassword(newPassword);
            studentDao.save(entity);

            return "Password has been updated";
        }
        return "Something went wrong!";
    }


}
