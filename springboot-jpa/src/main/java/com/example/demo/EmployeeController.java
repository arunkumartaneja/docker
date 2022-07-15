package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public String add() {
		employeeService.add(getEmployees());
		return "employee added";
	}

	List<Employee> getEmployees() {
		return IntStream.range(0, 5).mapToObj(x -> new Employee("f" + x, "l" + x, "e" + x))
				.collect(Collectors.toList());
	}

}
