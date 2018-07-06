package com.gam.project.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gam.project.entities.Student;

@Service
public interface IStudentServices {
	public List<Student> getAllStudent();
	public void store(Student student);
}
