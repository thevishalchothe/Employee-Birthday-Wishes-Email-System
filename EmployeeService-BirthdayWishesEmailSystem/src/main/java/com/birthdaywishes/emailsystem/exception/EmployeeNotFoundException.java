package com.birthdaywishes.emailsystem.exception;

public class EmployeeNotFoundException extends RuntimeException {

	// Constructor to accept the exception message
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}