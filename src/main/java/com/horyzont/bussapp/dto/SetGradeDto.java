package com.horyzont.bussapp.dto;

public class SetGradeDto {
    private Integer grade;
    private Integer studentId;
    private Integer subjectId;

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getGrade() {
        return grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }
}
