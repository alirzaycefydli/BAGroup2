package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.GradeDao;
import com.horyzont.bussapp.entities.GradeEntity;
import com.horyzont.bussapp.entities.StudentEntity;
import com.horyzont.bussapp.entities.SubjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    GradeDao gradeDao;

    public List<GradeEntity> getAllGrades() {
        return gradeDao.findAll();
    }

    public List<GradeEntity> getGradesByStudentId(Integer studentId) {
        return gradeDao.getGradeByStudentId(studentId);
    }

    public void setGrade(Integer grade, Integer student_id, Integer subject_id) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(student_id);

        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.setId(subject_id);

        GradeEntity gradeEntity = new GradeEntity();
        gradeEntity.setGrade(grade);
        gradeEntity.setStudent(studentEntity);
        gradeEntity.setSubject(subjectEntity);
        gradeDao.save(gradeEntity);
    }
}
