package com.kishori.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kishori.dao.StudentDao;
import com.kishori.entity.Student;
import com.kishori.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return studentservice.getStudents();
	}

	@GetMapping("/getStudent/{rollno}")
	public Optional<Student> getStudent(@PathVariable int rollno){
		return studentservice.getStudent(rollno);
	}
	
	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student)
	{
		return studentservice.createStudent(student);
		
	}
	
	@PutMapping("/updateStudent/{rollno}")
	public String updateStudent(@PathVariable int rollno,@RequestBody Student student)
	{
		return studentservice.updateStudent(rollno, student);
		
	}
	
	@DeleteMapping("/deleteStudent/{rollno}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String rollno)
	{
		try
		{
			studentservice.deleteStudent(Integer.parseInt(rollno));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
		
	}
	

}
