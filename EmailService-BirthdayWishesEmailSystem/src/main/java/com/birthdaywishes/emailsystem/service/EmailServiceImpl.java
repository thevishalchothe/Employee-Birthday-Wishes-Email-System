package com.birthdaywishes.emailsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birthdaywishes.emailsystem.repository.EmailLogRepository;

@Service
public class EmailServiceImpl implements EmailServiceI {

	@Autowired
    private EmailLogRepository emailLogRepository;

}
