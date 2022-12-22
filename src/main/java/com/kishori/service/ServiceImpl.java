package com.kishori.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishori.dao.StudentDao;
import com.kishori.entity.Student;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentdao;

	@Override
	public List<Student> getStudents() {
		return studentdao.findAll();
	}


	@Override
	public Optional<Student> getStudent(int rollno) {
	
		return studentdao.findById(rollno);
	}


	@Override
	public Student createStudent(Student student) {

		studentdao.save(student);
		return student;
	}

	@Override
	public String updateStudent(int rollno, Student student) {
		Optional<Student> st=studentdao.findById(rollno);
		if(st.isPresent())
		{
			Student s= st.get();
			s.setName(student.getName());
			s.setAddress(student.getAddress());
			s.setMobile_no(student.getMobile_no());
			s.setPercentage(student.getPercentage());
			
			studentdao.save(s);
			return "Student details updated Successfully.....";
		}else
		{
		return "Roll number not Exist";
		}
	}


	@Override
	public Student deleteStudent(int parseInteger) {
	    Student entity=studentdao.getById(parseInteger);
	    studentdao.delete(entity);
		return entity;
	}

	



}
