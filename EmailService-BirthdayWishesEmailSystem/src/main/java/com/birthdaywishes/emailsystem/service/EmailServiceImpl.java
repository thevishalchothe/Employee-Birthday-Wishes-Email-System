package com.birthdaywishes.emailsystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.birthdaywishes.emailsystem.model.EmailLog;
import com.birthdaywishes.emailsystem.model.Employee;
import com.birthdaywishes.emailsystem.repository.EmailLogRepository;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailServiceI {

	@Autowired
    private EmailLogRepository emailLogRepository;

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private RestTemplate restTemplate;
	
	// URLs for external API calls
	private static final String EMPLOYEE_BIRTHDAYS_TODAY_URL = "http://localhost:8081/Employee/birthdays/today";

	public void sendBirthdayEmails() { // Send birthday email's for employees with today's birthdays

		// Fetch employees with today's birthdays from Employee Service
		ResponseEntity<Employee[]> response = restTemplate.getForEntity(EMPLOYEE_BIRTHDAYS_TODAY_URL, Employee[].class);

		Employee[] employees = response.getBody();

		if (employees != null && employees.length > 0) {
			for (Employee employee : employees) {
				try {
					sendEmail(employee.getEmail(), employee.getName()); // Send email for each employee one by one
				} catch (Exception e) {
					logEmailActivity(employee.getEmail(), "FAILED"); 					// Log failure
					System.err.println("Error sending email to: " + employee.getEmail());
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("No employees with today's birthdays.");
		}
	}

	private void sendEmail(String to, String name) throws Exception {
		
		MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true); // Enable HTML and attachments

        helper.setTo(to);
        helper.setSubject("Wishing you a very Happy Birthday, " + name + " 🎉🎈🎂");

     // HTML email content with symbols and birthday-related image, centered
        String emailText = 
            "<html>" +
            "<body>" +
            "<h2>Cheers to you on your birthday, " + name + " 🎉🎈🎂</h2>" +
            "<p >On behalf of everyone at <strong>Patil & Sons Pvt Ltd</strong>, we would like to wish you <strong>a Very Happy Birthday! 🎉🎂</strong> </p>" +
            "<p >May your day be filled with joy, laughter, and wonderful moments. 💫🎈🎁</p>" +
            "<p >Best wishes,<br>The Team (Patil Bolte Public!)</p>" +
            "<p ><em>--------------------</em></p>" +
            "<div >" +
            "<img src='https://www.wewishes.com/uploads/images/202311/image_870x_65575549b4477.webp' alt='Birthday Image' width='500' />" +  // Image link (replace with your actual image link)
            "</div>" +
            "<p ><em>--------------------</em></p>" +
            "<p><strong>Chothe Patil & Sons Pvt Ltd</strong><br>Email: <a href='mailto:vishalchothe134@gmail.com'>vishalchothe134@gmail.com</a><br>Phone: 9552001231</p>" +
            "</body>" +
            "</html>";


        helper.setText(emailText, true); // Enable HTML content
        
		// Attempt to send the email and log the activity
		try {
			mailSender.send(message);
			logEmailActivity(to, "SENT");
		} catch (Exception e) {
			logEmailActivity(to, "FAILED");
			throw e; // Re-throw the exception to ensure failure is logged
		}

		System.out.println("Birthday email sent to: " + to);
	}

	private void logEmailActivity(String recipientEmail, String status) {

		EmailLog log = new EmailLog(); 		// Create a new log entry
        log.setRecipientEmail(recipientEmail);
        log.setStatus(status);
        log.setTimestamp(LocalDateTime.now());

        emailLogRepository.save(log);        // Save to database
        
		// Print log status to console (optional)
		System.out.println("Email log: " + status + " to " + recipientEmail);
	}

}
