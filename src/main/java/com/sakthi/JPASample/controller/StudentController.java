package com.sakthi.JPASample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakthi.JPASample.Repostory.StudentReposirory;

@RestController
public class StudentController {
	
	@Autowired
	private StudentReposirory studentRepo;
	
	@RequestMapping("/getStudents")
	public List getAllStudents(){
		return studentRepo.findAll();
		
	}

}
