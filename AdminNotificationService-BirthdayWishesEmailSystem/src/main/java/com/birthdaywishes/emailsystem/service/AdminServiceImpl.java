package com.birthdaywishes.emailsystem.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.birthdaywishes.emailsystem.model.EmailLog;
import com.birthdaywishes.emailsystem.model.Employee;

@Service
public class AdminServiceImpl implements AdminServiceI {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${email.service.url}")  // Injecting the URL property from application.properties
    private String emailServiceUrl;

	// URLs for external API calls
    private static final String UPCOMING_BIRTHDAYS_URL = "http://localhost:8081/api/employee/upcoming-birthdays";

    // Fetch upcoming birthdays
    @Override
    public List<Employee> getUpcomingBirthdays() {
        ResponseEntity<Employee[]> response = restTemplate.getForEntity(UPCOMING_BIRTHDAYS_URL, Employee[].class);
        return Arrays.asList(response.getBody());
    }

    // Fetch email logs from Email Service
    @Override
    public List<EmailLog> getEmailLogs() {
        ResponseEntity<EmailLog[]> response = restTemplate.getForEntity(emailServiceUrl, EmailLog[].class);
        return Arrays.asList(response.getBody());
    }
	
}