package com.codix.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codix.di.model.College;
import com.codix.di.repo.DBRepo;


@Service
public class DBService implements IService {
	@Autowired
	DBRepo dbRepo;

	@Override
	public String login(College college) {

         try {
			College savedCollege = dbRepo.save(college);
			if (savedCollege != null)
				return college.getCollegename() + " is Registered Successfully";
			else
				return "College Not Registered. Please, send Email, College ID & College Name!";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "College Not Registered. Please, send Email, College ID & College Name!";
		}
	}

	@Override
	public List<College> getAllColleges() {
		return dbRepo.findAll();
	}

	@Override
	public String updateCollegeEmail(College college) {
		try {
			int isUpdated = dbRepo.updateCollegeEmail(college.getEmail(), college.getCollegeid());
			if (isUpdated == 0) 
				return "User Not Found";
			else 
				return college.getEmail() + " email is updated to:" + college.getCollegeid();
		} catch (Exception e) {
			e.printStackTrace();
			return "Please Send Email & CollegeId";
		}
	}

	@Override
	public String deleteByEmail(String email) {
		try {
			int isDeleted = dbRepo.deleteByEmail(email);
			if (isDeleted == 0) 
				return "College Not Found";
			else 
				return email + " Deleted";
		} catch (Exception e) {
			e.printStackTrace();
			return "Please Send Email";
		}
	}
}

