package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.TeacherEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
public class TeacherDaoImpl implements TeacherDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(TeacherEntity teacherEntity) {
        entityManager.persist(teacherEntity);
    }

    @Override
    public TeacherEntity getTeacherByStudentId(Integer id) {
        {
            String hql="SELECT * FROM Teachers WHERE subject_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();
        }

    }
    @Override
    public TeacherEntity getTeacheById(Integer id) {
        String hql="SELECT * FROM Teachers WHERE teacher_id = "+id;
            Query query=entityManager.createQuery(hql);
            return query.getResultList();

    }

    @Override
    public List<TeacherEntity> getAll() {
        String queryString = "SELECT * FROM Teachers";
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }
}

