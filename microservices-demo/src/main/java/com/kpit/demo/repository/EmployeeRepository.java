package com.kpit.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.kpit.demo.model.Employee;

;

@Repository
public class EmployeeRepository {


	public List<Employee> getEmployee() {
		RestTemplate restTemplate = new RestTemplate();

		List<Employee> employees2List = new ArrayList<Employee>();

		ResponseEntity<Employee[]> responseEntityArrEmployee = restTemplate
				.getForEntity("https://jsonplaceholder.typicode.com/users/", Employee[].class);

		System.out.println("responseEntityArrEmployee---->" + responseEntityArrEmployee);
		employees2List = Arrays.asList(responseEntityArrEmployee.getBody());
		return employees2List;


	}

}
