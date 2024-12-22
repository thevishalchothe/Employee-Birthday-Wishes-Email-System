package com.birthdaywishes.emailsystem.service;

import java.util.List;

import com.birthdaywishes.emailsystem.model.EmailLog;
import com.birthdaywishes.emailsystem.model.Employee;

public interface AdminServiceI {

	List<Employee> getUpcomingBirthdays();

	List<EmailLog> getEmailLogs();

	
}
