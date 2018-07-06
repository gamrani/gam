package com.gam.project.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id; 
	private String firstName;
	private String lastName; 
	private String password;
	private String tempPassword;
	private String token;
	private int age; 
	private int tel;
	private String email;
	private String CIN;
	
	public User(String firstName, String lastName, int age, String cIN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		CIN = cIN;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}
}
