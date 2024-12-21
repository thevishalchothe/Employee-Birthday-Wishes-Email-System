package com.birthdaywishes.emailsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthdaywishes.emailsystem.model.EmailLog;

@Repository
public interface EmailLogRepository extends JpaRepository<EmailLog, Long>  {

	
}
