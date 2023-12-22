package com.project.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.practice.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
