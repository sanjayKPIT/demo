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
		emp.setEmployeeId("1");
		emp.setName("Ram");
		emp.setDesignation("Software Engineer");
		emp.setSalary(15000);
		return emp;

	}

}
