package com.gam.project.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gam.project.entities.Student;
import com.gam.project.services.IStudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	IStudentServices studentServices;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Student> getAllStudent(){
		List<Student> students;
		
		try {
			students = studentServices.getAllStudent();
		}catch(Exception e) {
			students=null;
			System.out.println(e.getMessage());
		}
		
		return students;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void store(@RequestBody Student student) {
		
		try{
			studentServices.store(student);
			System.out.println(student);
		}catch(Exception e) {
			System.out.println(student+" : "+e.getMessage());
		}
	}
}
