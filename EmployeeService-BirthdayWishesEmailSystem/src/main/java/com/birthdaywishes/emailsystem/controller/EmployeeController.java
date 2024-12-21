package com.birthdaywishes.emailsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdaywishes.emailsystem.model.Employee;
import com.birthdaywishes.emailsystem.service.EmployeeServiceI;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceI employeeServiceI;

	@PostMapping("/add") // Add a new employee
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		System.out.println("Received Employee: " + employee); // Debug log
		Employee newEmployee = employeeServiceI.addEmployee(employee);
		return new ResponseEntity<>(newEmployee + " Employee added successfully!", HttpStatus.CREATED);
	}
 
	@GetMapping("/getall") // Retrieve all employees
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeServiceI.getAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	@GetMapping("/getsingle/{id}") // Retrieve a single employee by ID
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		System.out.println("Getting Single Employee with ID: " + id); // Debugging line
		Employee employee = employeeServiceI.getEmployeeById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@PutMapping("/update/{id}") // Update an existing employee
	public ResponseEntity<String> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
		System.out.println("Updating Employee with ID: " + id); // Debugging line
		employeeServiceI.updateEmployee(id, updatedEmployee);
		return new ResponseEntity<>("Employee updated successfully!", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}") // Delete an employee
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
		System.out.println("Deleting Employee with ID: " + id); // Debugging line
		employeeServiceI.deleteEmployee(id);
		return new ResponseEntity<>("Employee deleted successfully!", HttpStatus.OK);
	}

	@GetMapping("/birthdays/today") // Retrieve employees having birthdays today
	public ResponseEntity<List<Employee>> getTodayBirthdays() {
		System.out.println("Getting Employee with BirthDay"); // Debugging line
		List<Employee> birthdayEmployees = employeeServiceI.getTodayBirthdays();
		return new ResponseEntity<>(birthdayEmployees, HttpStatus.OK);

	}
	
}