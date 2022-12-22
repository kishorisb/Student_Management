package com.kishori.service;

import java.util.List;
import java.util.Optional;

import com.kishori.entity.Student;

public interface StudentService {

	public List<Student> getStudents();
	
	public Optional<Student> getStudent(int rollno);
	
	public Student createStudent(Student student);
	
	public String updateStudent(int rollno,Student student); 
	
	public Student deleteStudent(int rollno);

	
	
}
