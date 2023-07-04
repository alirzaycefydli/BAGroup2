package com.horyzont.bussapp.controller;


import com.horyzont.bussapp.entities.GradeEntity;
import com.horyzont.bussapp.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    GradeService gradeService;

    @GetMapping("/getStudentGrades/{student_id}")
    public List<GradeEntity> getAllGrades(@PathVariable Integer student_id) {
        return gradeService.getGradesByStudentId(student_id);
    }
}
