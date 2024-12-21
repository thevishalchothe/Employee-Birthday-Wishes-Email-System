package com.birthdaywishes.emailsystem.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailLog {
	
	private Long id;
    private String recipientEmail;
    private String status; // SENT or FAILED
    private LocalDateTime timestamp;
    
}