package com.birthdaywishes.emailsystem.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.birthdaywishes.emailsystem.service.EmailServiceI;

@Component
public class BirthdayScheduler {

	@Autowired
	private EmailServiceI emailService;
	
	

}
