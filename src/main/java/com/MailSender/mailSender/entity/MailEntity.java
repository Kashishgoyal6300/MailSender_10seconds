package com.MailSender.mailSender.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mail_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MailEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String recipientEmail;
	 private String subject;
	 @Column(columnDefinition = "TEXT")
	 private String message;

	    private LocalDateTime sentAt;
	 
}
