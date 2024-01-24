package com.employee.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public interface EmployeeService  extends JpaRepository<Employee,Long>{

}
