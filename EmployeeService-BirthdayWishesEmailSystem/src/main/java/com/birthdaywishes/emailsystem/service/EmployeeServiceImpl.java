package com.birthdaywishes.emailsystem.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birthdaywishes.emailsystem.exception.EmployeeNotFoundException;
import com.birthdaywishes.emailsystem.model.Employee;
import com.birthdaywishes.emailsystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("Saving Employee: " + employee);
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id).orElse(null);
		if (employee == null) {
			throw new EmployeeNotFoundException("Employee not found with ID: " + id);
		}
		return employee;
	}

	@Override
	public void updateEmployee(Long id, Employee updatedEmployee) {
		Employee existingEmployee = employeeRepository.findById(id).orElse(null);
		if (existingEmployee == null) {
			throw new EmployeeNotFoundException("Employee not found with ID: " + id);
		}
		existingEmployee.setName(updatedEmployee.getName());
		existingEmployee.setEmail(updatedEmployee.getEmail());
		existingEmployee.setBirthday(updatedEmployee.getBirthday());
		employeeRepository.save(existingEmployee);
	}

	@Override
	public void deleteEmployee(Long id) {
		Employee employee = employeeRepository.findById(id).orElse(null);
		if (employee == null) {
			throw new EmployeeNotFoundException("Employee not found with ID: " + id);
		}
		employeeRepository.delete(employee);
	}

	@Override
	public List<Employee> getTodayBirthdays() {
		return employeeRepository.findByBirthday(LocalDate.now());
	}

}
