package com.horyzont.bussapp.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "subjects")
public class SubjectEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private TeacherEntity teacher_id;
    @Column(name = "start_date")
    private Date start_date;
    @Column(name = "end_date")
    private Date end_date;
    @Column(name = "grade_date")
    private Date grade_date;
    @Column(name = "grade")
    private Double grade;
}
