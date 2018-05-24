package com.dhbwKa.sumzTest.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhbwKa.sumzTest.Dao.StudentDao;
import com.dhbwKa.sumzTest.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return this.studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id){
		return this.studentDao.getStudentById(id);
	}
	
	public void deleteStudentById(int id){
		this.studentDao.deleteStudentById(id);
	}
	
	public Student updateStudentById(Student student){
		return this.studentDao.updateStudentById(student);
	}

	public Student addStudent(Student student) {
		return this.studentDao.addStudent(student);
	}
}
