package com.codix.di.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
      
	@GetMapping("print/{college_name}")
	String Pathvariable(@PathVariable (name= "college_name")String collegeName) {
	System.out.println(collegeName);
	return "Printed";
    }
	
	@PostMapping(path="post")
	void printStatement(@RequestBody String name) {
	System.out.println(name);
	}
}