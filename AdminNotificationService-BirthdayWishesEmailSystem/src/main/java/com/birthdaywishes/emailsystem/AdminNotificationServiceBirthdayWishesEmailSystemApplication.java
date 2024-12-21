package com.birthdaywishes.emailsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@SpringBootApplication
public class AdminNotificationServiceBirthdayWishesEmailSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminNotificationServiceBirthdayWishesEmailSystemApplication.class, args);
	}
	@Bean
	 public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

}
