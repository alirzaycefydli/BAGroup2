package com.horyzont.bussapp;

import com.horyzont.bussapp.dao.AuthorDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BussappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BussappApplication.class, args);

        AuthorDaoImpl imp = new AuthorDaoImpl();

        System.out.print(imp.getById(1));
    }

}
