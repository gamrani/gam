package com.gam.project.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Presence implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private Date date;
	private int hour;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="fk_course")
	private Course course;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="fk_student")
	private Student student;
	private boolean present;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public Presence(Date date, int hour, Course course, Student student, boolean present) {
		super();
		this.date = date;
		this.hour = hour;
		this.course = course;
		this.student = student;
		this.present = present;
	}
	public Presence() {
		super();
	}
	
	
	
}
