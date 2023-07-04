package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDao extends JpaRepository<SubjectEntity, Integer> {
    @Query("SELECT s from SubjectEntity s WHERE s.teacher_id.id = ?1")
    List<SubjectEntity> findAllByTeacherId(Integer teacher_id);
}