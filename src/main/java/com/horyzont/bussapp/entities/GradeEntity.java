package com.horyzont.bussapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class GradeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "grade")
    private Integer grade;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @OneToOne
    private StudentEntity student;
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    @OneToOne
    private SubjectEntity subject;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public void setSubject(SubjectEntity subject) {
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGrade() {
        return grade;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public SubjectEntity getSubject() {
        return subject;
    }
}
