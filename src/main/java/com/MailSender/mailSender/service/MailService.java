package com.MailSender.mailSender.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.MailSender.mailSender.entity.MailEntity;
import com.MailSender.mailSender.repository.MailRepository;
@Service
public class MailService {

	 @Autowired
	    private JavaMailSender mailSender;
	@Autowired 
	private MailRepository	 mailRepository;
	
	public void sendMail(String to,String subject,String text) {
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(text);
		mailSender.send(mail);
		
		MailEntity log = MailEntity.builder()
                .recipientEmail(to)
                .subject(subject)
                .message(text)
                .sentAt(LocalDateTime.now())
                .build();
		        mailRepository.save(log);
		        System.out.println("Mail sent and logged successfully.");
	}
	
}
