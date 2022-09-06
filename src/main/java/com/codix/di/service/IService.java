package com.codix.di.service;

import java.util.List;

import com.codix.di.model.College;


public interface IService {
	
	String login(College college);
	
	List<College> getAllColleges();
	
	String updateCollegeEmail(College college);
	
	String deleteByEmail(String email);

}
