package com.birthdaywishes.emailsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdaywishes.emailsystem.service.EmployeeServiceI;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceI employeeServiceI;

	
}