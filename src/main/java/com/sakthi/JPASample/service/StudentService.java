package com.sakthi.JPASample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakthi.JPASample.Repostory.StudentReposirory;

@Transactional
@Service
public class StudentService {
	
	@Autowired
	StudentReposirory studentRepo;
	
	public List getAllStudents() {
        return (List) studentRepo.findAll();
    }

}
