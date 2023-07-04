package com.horyzont.bussapp.dao;

import com.horyzont.bussapp.entities.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeDao extends JpaRepository<GradeEntity, Integer> {
    @Query("SELECT g from GradeEntity g WHERE g.student.id = ?1")
    public List<GradeEntity> getGradeByStudentId(Integer studentId);
}
