package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.BookEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
public class BookDaoImpl implements BookDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(BookEntity bookEntity) {
        entityManager.persist(bookEntity);
    }

    @Override
    public BookEntity getbookBySubjecttId(Integer id) {
        {
            String hql="SELECT * FROM books WHERE subject_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();
        }

    }
    @Override
    public BookEntity getbookById(Integer id) {
        String hql="SELECT * FROM books WHERE book_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();

    }
    @Override
    public BookEntity getBookByAuthorId(Integer id) {
        String hql="SELECT * FROM books WHERE author_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();

    }

    @Override
    public List<BookEntity> getAll() {
        String queryString = "SELECT * FROM books";
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }