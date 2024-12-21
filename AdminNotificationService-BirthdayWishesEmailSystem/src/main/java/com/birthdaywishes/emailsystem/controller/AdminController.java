package com.birthdaywishes.emailsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.birthdaywishes.emailsystem.service.AdminServiceI;

@RestController
public class AdminController {

	@Autowired
	private AdminServiceI adminServiceI;
	
	


}