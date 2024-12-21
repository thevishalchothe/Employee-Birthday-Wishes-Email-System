package com.birthdaywishes.emailsystem.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.birthdaywishes.emailsystem.service.EmailServiceI;

@Component
public class BirthdayScheduler {

	@Autowired
	private EmailServiceI emailService;

	// Scheduler runs every day at 15:00 PM
	@Scheduled(cron = "0 0 15 * * *")
	public void triggerBirthdayEmails() {
		System.out.println("Scheduler triggered to send birthday emails...");
		emailService.sendBirthdayEmails();
	}

}
