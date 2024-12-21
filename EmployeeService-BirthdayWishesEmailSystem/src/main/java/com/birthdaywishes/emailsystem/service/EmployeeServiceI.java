package com.birthdaywishes.emailsystem.service;

import java.util.List;

import com.birthdaywishes.emailsystem.model.Employee;

public interface EmployeeServiceI {

	Employee addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	void updateEmployee(Long id, Employee updatedEmployee);

	void deleteEmployee(Long id);

	List<Employee> getTodayBirthdays();

}
