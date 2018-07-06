package com.gam.project.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Responsable extends User {

	@Autowired
	@OneToOne(mappedBy="responsable")
	@JsonIgnore
	private Student student;

	public Responsable(String firstName, String lastName, int age, String cIN) {
		super(firstName, lastName, age, cIN);
	}

	public Responsable() {
	
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
