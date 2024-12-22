package com.birthdaywishes.emailsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdaywishes.emailsystem.model.EmailLog;
import com.birthdaywishes.emailsystem.model.Employee;
import com.birthdaywishes.emailsystem.service.AdminServiceI;

@RestController
public class AdminController {

	@Autowired
	private AdminServiceI adminServiceI;
	
	@GetMapping("/upcoming-birthdays")
	public ResponseEntity<List<Employee>> getUpcomingBirthdays() {
	    List<Employee> birthdays = adminServiceI.getUpcomingBirthdays();
	    return new ResponseEntity<>(birthdays, HttpStatus.OK);
	}

	@GetMapping("/email-logs")
	public ResponseEntity<List<EmailLog>> getEmailLogs() {
	    List<EmailLog> logs = adminServiceI.getEmailLogs();
	    return new ResponseEntity<>(logs, HttpStatus.OK);
	}



}