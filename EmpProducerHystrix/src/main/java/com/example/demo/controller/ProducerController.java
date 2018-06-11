package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ProducerController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "getDataFallBack")
	public Employee firstPage() {

		System.out.println("Inside firstPage");

		Employee emp = new Employee();
		emp.setEmployeeId("1");
		emp.setName("Ram");
		emp.setDesignation("Software Engineer");
		emp.setSalary(15000);

		if (emp.getName().equalsIgnoreCase("Ram"))
			throw new RuntimeException();

		return emp;

	}

	public Employee getDataFallBack() {

		System.out.println("Inside fallback");

		Employee emp = new Employee();
		emp.setName("fallback-Ram");
		emp.setDesignation("fallback-Software Engineer");
		emp.setEmployeeId("fallback-1");
		emp.setSalary(15000);

		return emp;

	}

}
