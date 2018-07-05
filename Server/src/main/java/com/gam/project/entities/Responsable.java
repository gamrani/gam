package com.gam.project.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Responsable extends User {

	@Autowired
	@OneToOne(mappedBy="responsable")
	private Student student;

	public Responsable(Long id, String firstName, String lastName, int age, String cIN) {
		super(id, firstName, lastName, age, cIN);
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
