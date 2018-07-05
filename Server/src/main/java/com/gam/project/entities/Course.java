package com.gam.project.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Course implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String name;
	private Long note;
	
	@Autowired
	@ManyToOne
	@JoinColumn(name="prof_course")
	private Prof prof;
	
	@Autowired
	@ManyToMany
	@JoinTable(name="course_student", 
	           joinColumns= {@JoinColumn(name="fk_course")},
	           inverseJoinColumns= {@JoinColumn(name="fk_student")})
    private List<Student> students ;
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Prof getProf() {
		return prof;
	}
	public void setProf(Prof prof) {
		this.prof = prof;
	}
	public Course(Long id, String name, Long note) {
		super();
		this.id = id;
		this.name = name;
		this.note = note;
	}
	public Course() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNote() {
		return note;
	}
	public void setNote(Long note) {
		this.note = note;
	}
	
	
}
