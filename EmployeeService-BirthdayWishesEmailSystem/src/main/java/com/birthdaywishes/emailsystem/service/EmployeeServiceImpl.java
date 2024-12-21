package com.birthdaywishes.emailsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birthdaywishes.emailsystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	
}
