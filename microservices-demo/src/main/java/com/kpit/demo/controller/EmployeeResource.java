package com.kpit.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo.VM.EmployeeModel;
import com.kpit.demo.model.Employee;
import com.kpit.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
		List<Employee> emply = employeeRepository.getEmployee();
		System.out.println("------------" + emply);
		List<EmployeeModel> employeeVm =  employeeRepository.getEmployee().stream().map(user -> 
		 new EmployeeModel(user)
		).collect(Collectors.toList());

		return new ResponseEntity<>(employeeVm, HttpStatus.OK);
		
	}

}
