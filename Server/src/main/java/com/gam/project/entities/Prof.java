package com.gam.project.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Entity
public class Prof extends User {

 	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Autowired
	@OneToMany(mappedBy="prof")
    private List<Course> courses;
 	
 	@Autowired
 	@ManyToMany
 	@JoinTable(name="prof_student",
 	           joinColumns= {@JoinColumn(name="fk_prof")},
 	           inverseJoinColumns= {@JoinColumn(name="fk_course")})
 	private List<Student> students;

	
	public Prof() {
		
	}

	public Prof(Long id, String firstName, String lastName, int age, String cIN) {
		super(id, firstName, lastName, age, cIN);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
 	
}
