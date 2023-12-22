package com.project.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.practice.model.Employee;
import com.project.practice.service.EmployeeServiceInterface;


@RestController
@RequestMapping("/code")

public class EmployeeController {

	
	
	@Autowired
	private EmployeeServiceInterface employeeserivce;
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee>addemp(@RequestBody Employee emp)
	{
		Employee empsave=employeeserivce.addemployee(emp);
		return new ResponseEntity<Employee>(empsave,HttpStatus.CREATED);
	}
	
}
