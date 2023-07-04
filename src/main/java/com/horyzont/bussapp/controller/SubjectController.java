package com.horyzont.bussapp.controller;


import com.horyzont.bussapp.entities.SubjectEntity;
import com.horyzont.bussapp.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/getAllSubjects")
    public List<SubjectEntity> getAllSubjects() {
        return subjectService.getAllSubject();
    }

    @GetMapping("/addSubject/{name}/{desc}/{teacher_id}/{start_date}/{end_date}/{grade_date}")
    public SubjectEntity addSubject(
            @PathVariable String name,
            @PathVariable String desc,
            @PathVariable Integer teacher_id,
            @PathVariable String start_date,
            @PathVariable String end_date,
            @PathVariable String grade_date
    ) {
        return subjectService.addSubject(name, desc, teacher_id, start_date, end_date, grade_date);
    }

    @GetMapping("/removeSubject/{subject_id}")
    public void removeSubject(@PathVariable Integer subject_id) {
        subjectService.removeSubject(subject_id);
    }

    @GetMapping("/getALlSubjectByTeacherId/{teacher_id}")
    public List<SubjectEntity> getALlSubjectByTeacherId(@PathVariable Integer teacher_id) {
        return subjectService.getAllSubjectByTeacherId(teacher_id);
    }
}