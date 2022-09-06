package com.codix.di.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer collegeId;
	String collegeName;
	String email;

	public Integer getCollegeid() {
		return collegeId;
	}

	public void setCollegeid(Integer  collegeid) {
		this.collegeId = collegeid;
	}

	public String getCollegename() {
		return collegeName;
	}

	public void setCollegename(String collegename) {
		this.collegeName = collegename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	College() {
	}
}