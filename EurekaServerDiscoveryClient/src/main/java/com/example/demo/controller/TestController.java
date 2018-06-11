package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee show() {
		Employee emp = new Employee();
		emp.setEmployeeId("2");
		emp.setName("Shyam");
		emp.setDesignation("Sr. Software Engineer");
		emp.setSalary(20000);
		return emp;

	}

}
