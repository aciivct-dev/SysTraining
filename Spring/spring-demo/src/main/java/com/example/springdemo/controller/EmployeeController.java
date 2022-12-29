package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.entity.Employee;
import com.example.springdemo.repository.EmployeeRepository;




@RestController

@RequestMapping("/emp1")
public class EmployeeController {


	@Autowired
	
	EmployeeRepository emprep;
	
	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee)
	{
		return emprep.save(employee);
	}
	@GetMapping
	public List <Employee> getAllEmps()
	{
		return emprep.findAll();
	}
	
	@PutMapping
	public Employee updateEmp(@RequestBody Employee employee)
	{
		return emprep.save(employee);
	}
	@DeleteMapping
	
	public String deleteEmp(@RequestParam Integer empId)
	{
		 emprep.deleteById(empId);
		 return "Deleted Emp ID" + empId;
		
	}
}
