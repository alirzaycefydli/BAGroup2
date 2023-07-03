package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.AuthorEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
public class AuthorDaoImpl implements AuthorDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(AuthorEntity authorEntity) {
        entityManager.persist(authorEntity);
    }

    @Override
    public AuthorEntity getById(Integer id) {

    }

    @Override
    public List<AuthorEntity> getAll() {
        String queryString = "SELECT * FROM authors";
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }
}
