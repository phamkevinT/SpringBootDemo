package com.kevinpham.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinpham.thymeleafdemo.entity.Employee;

/**
 * 
 * Spring Data REST allows Spring to give us all the basic REST API CRUD features
 * 
 * Spring Data REST will create endpoints based on entity type:
 * 		- First character of Entity type is lowercase
 * 		- Add 's' to the entity
 * 		- Our example.... Entity type = Employee --> /employees
 * 
 * 		POST    /employees
 * 		GET     /employees
 * 		GET     /employees/{employeeId}
 * 		PUT     /employees/{employeeId}
 * 		DELETE  /employee/{employeeId}
 *
 */

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// Add a method to sort by last name
	// Spring Data JPA will parse the method name to create appropriate query:
	// 'find all by' .... 'order by last name ascending'
	public List<Employee> findAllByOrderByLastNameAsc();

}
