package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/emp/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
//	public String display() {
//		return "Hello EveryOne!";
//	}
  @GetMapping("/get")
  public ResponseEntity<List<Employee>>  getAll(){
		return  ResponseEntity.ok(employeeservice.findAll());
	}
  @PostMapping("/add")
  public ResponseEntity<Employee> addAll(@RequestBody Employee emp) {
	  return ResponseEntity.ok(employeeservice.save(emp));
  }
	
}
