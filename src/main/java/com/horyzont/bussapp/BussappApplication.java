package com.horyzont.bussapp;

import com.horyzont.bussapp.dao.AuthorDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BussappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BussappApplication.class, args);

        AuthorDaoImpl imp = new AuthorDaoImpl();

        System.out.print(imp.getById(1));
    }

}
