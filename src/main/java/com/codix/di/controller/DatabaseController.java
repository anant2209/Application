package com.codix.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codix.di.model.College;
import com.codix.di.service.DBService;

@RestController
@RequestMapping(path = "/login")
public class DatabaseController {
	@Autowired
	DBService dbService;

	@PostMapping
	void register(@RequestBody College college) {
		dbService.login(college);
	}

	@GetMapping
	List<College> getAllUsers() {
		return dbService.getAllColleges();
	}

	@PatchMapping
	String updateUserPhoneNumber(@RequestBody College college) {
		return dbService.updateCollegeEmail(college);
	}

	@DeleteMapping
	String deleteUserEmail(@RequestParam(name = "email") String email) {
		return dbService.deleteByEmail(email);
	}
}
