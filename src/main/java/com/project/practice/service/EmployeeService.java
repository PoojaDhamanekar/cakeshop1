package com.project.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.practice.model.Employee;
import com.project.practice.repo.EmployeeRepo;
@Service
public class EmployeeService  implements EmployeeServiceInterface{

	
	
	@Autowired
	private EmployeeRepo emprepo;
	@Override
	public Employee addemployee(Employee emp) {
		Employee saveemp=emprepo.save(emp);
		return saveemp;
	}



}
