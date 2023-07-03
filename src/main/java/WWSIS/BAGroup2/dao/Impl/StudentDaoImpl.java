package WWSIS.BAGroup2.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import WWSIS.BAGroup2.dao.StudentDao;
import WWSIS.BAGroup2.entity.StudentEntity;

import java.util.List;

@Transactional
public class StudentDaoImpl implements StudentDao {
    @PersistenceContext
    EntityManager entityManager;

	@Override
	public void addStudent(StudentEntity student) {
		entityManager.persist(student);
	}

	@Override
	public void updateStudent(StudentEntity student) {
		entityManager.merge(student);
	}

	@Override
	public StudentEntity getStudentById(int studentId) {
		return entityManager.find(StudentEntity.class, studentId);
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		//return entityManager.createQuery("from Student", StudentEntity.class).getResultList();
		return null;
	}

	@Override
	public void deleteStudent(int studentId) {
		 StudentEntity student = entityManager.find(StudentEntity.class, studentId);
	        if (student != null) {
	            entityManager.remove(student);
	        }
	}

  
}