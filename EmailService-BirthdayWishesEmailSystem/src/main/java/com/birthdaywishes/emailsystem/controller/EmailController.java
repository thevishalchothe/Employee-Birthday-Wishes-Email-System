package com.birthdaywishes.emailsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdaywishes.emailsystem.service.EmailServiceI;

@RestController
@RequestMapping("/Email")
public class EmailController {

	@Autowired
	private EmailServiceI emailServiceI;

	@GetMapping("/send")
	public ResponseEntity<String> sendEmails() {
		// Trigger the sending of birthday emails
		emailServiceI.sendBirthdayEmails();
		return new ResponseEntity<>("Birthday emails triggered manually!", HttpStatus.OK);
	}
}