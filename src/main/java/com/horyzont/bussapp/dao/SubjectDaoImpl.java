package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.SubjectEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
public class SubjectDaoImpl implements SubjectDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(SubjectEntity subjectEntity) {
        entityManager.persist(subjectEntity);
    }

    @Override
    public SubjectEntity getsubjectByStudentId(Integer id) {
        {
            String hql="SELECT * FROM subjects WHERE student_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();
        }

    }
    @Override
    public SubjectEntity getsubjectById(Integer id) {
        String hql="SELECT * FROM subjects WHERE subject_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();

    }

    @Override
    public List<SubjectEntity> getAll() {
        String queryString = "SELECT * FROM subjects";
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }

