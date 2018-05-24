package com.dhbwKa.sumzTest.Dao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dhbwKa.sumzTest.Entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			
			{
				put(1, new Student(1, "Said", "Computer Science"));
				put(2, new Student(2, "Alex U", "Finance"));
				put(3, new Student(3, "Anna", "Maths"));
			}
		};
	}
	
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	public Student getStudentById(int id){
		return this.students.get(id);
	}

	public void deleteStudentById(int id) {
		this.students.remove(id);
	}
	
	public Student updateStudentById(Student student){
		this.students.put(student.getId(), student);
		
		return student;
	}

	public Student addStudent(Student student) {
		student.setId(Collections.max(students.keySet()) + 1);
		this.students.put(student.getId(), student);
		
		return student;
	}
}
