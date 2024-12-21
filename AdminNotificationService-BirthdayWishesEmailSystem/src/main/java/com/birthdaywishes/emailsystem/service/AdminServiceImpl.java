package com.birthdaywishes.emailsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminServiceImpl implements AdminServiceI {

	@Autowired
	private RestTemplate restTemplate;
	
	
}