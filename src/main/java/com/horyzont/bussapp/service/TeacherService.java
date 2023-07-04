package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.TeacherDao;
import com.horyzont.bussapp.entities.TeacherEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherDao teacherDao;

    public boolean login(String mail, String password){
        Integer count = teacherDao.findByMailAndPassword(mail, password);
        if (count ==1){
            return true;
        }else {
            return false;
        }
    }

    public TeacherEntity register(String first_name, String last_name, String email, String password, String login){
        TeacherEntity entity = new TeacherEntity();
        entity.setFirst_name(first_name);
        entity.setLast_name(last_name);
        entity.setEmail(email);
        entity.setPassword(password);
        entity.setLogin(login);
        teacherDao.save(entity);
        return entity;
    }

    public void deleteAccount(Integer id){
        TeacherEntity entity = new TeacherEntity();
        entity.setId(id);
        teacherDao.delete(entity);
    }

    public String remindPassword(String email){
        TeacherEntity entity = teacherDao.findByMail(email);
        System.out.println(entity.getPassword());
        return entity.getPassword();
    }

    public String resetPassword(String email, String password, String newPassword){
        TeacherEntity entity = teacherDao.findByMail(email);
        if (entity.getPassword().equals(password)){
            entity.setPassword(newPassword);
            teacherDao.save(entity);

            return "Password has been updated";
        }
        return "Something went wrong!";
    }


}
