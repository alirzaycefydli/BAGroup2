package WWSIS.BAGroup2.dao;
import WWSIS.BAGroup2.entity.StudentEntity;

import java.util.List;

public interface StudentDao {
    void addStudent(StudentEntity student);
    void updateStudent(StudentEntity student);
    StudentEntity getStudentById(int studentId);
    List<StudentEntity> getAllStudents();
    void deleteStudent(int studentId);
}