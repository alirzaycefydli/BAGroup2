package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.SubjectDao;
import com.horyzont.bussapp.entities.SubjectEntity;
import com.horyzont.bussapp.entities.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectDao subjectDao;

    public SubjectEntity addSubject(String name, String desc, Integer teacher_id, String start_date, String end_date, String grade_date) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setId(teacher_id);

        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.setName(name);
        subjectEntity.setDescription(desc);
        subjectEntity.setTeacher_id(teacherEntity);
        subjectEntity.setStart_date(start_date);
        subjectEntity.setEnd_date(end_date);
        subjectEntity.setGrade_date(grade_date);
        subjectDao.save(subjectEntity);
        return subjectEntity;
    }

    public void removeSubject(Integer subject_id) {
        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.setId(subject_id);
        subjectDao.delete(subjectEntity);
    }

    public List<SubjectEntity> getAllSubject() {
        return subjectDao.findAll();
    }

    public List<SubjectEntity> getAllSubjectByTeacherId(Integer student_id) {
        return subjectDao.findAllByTeacherId(student_id);
    }
}