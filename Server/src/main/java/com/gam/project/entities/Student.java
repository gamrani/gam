package com.gam.project.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
public class Student extends User {
	
	private int numeroApogee;
	private int numeroNational;	
	
	@Autowired
	@ManyToMany(mappedBy="students")
	private List<Prof> profs ;
	
	@Autowired
	@ManyToMany(mappedBy="students")
	private List<Course> courses ;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="fk_student")
	private Responsable responsable;
	
	@Autowired
	@OneToOne(mappedBy="student")
	private Presence presence;
	
	public Responsable getResponsable() {
		return responsable;
	}
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public List<Prof> getProfs() {
		return profs;
	}
	public void setProfs(List<Prof> profs) {
		this.profs = profs;
	}
	public Student() {
		super();
	}
	public Student(Long id, String firstName, String lastName, int age, int numeroApogee, int numeroNational, int cIN) {
		super();
		
		this.numeroApogee = numeroApogee;
		this.numeroNational = numeroNational;
		
	}
	
	public int getNumeroApogee() {
		return numeroApogee;
	}
	public void setNumeroApogee(int numeroApogee) {
		this.numeroApogee = numeroApogee;
	}
	public int getNumeroNational() {
		return numeroNational;
	}
	public void setNumeroNational(int numeroNational) {
		this.numeroNational = numeroNational;
	}
	
	
}
