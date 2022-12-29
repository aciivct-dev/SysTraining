package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
