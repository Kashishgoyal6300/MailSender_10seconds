package com.MailSender.mailSender.dto;

import lombok.Data;

@Data
public class MailRequest {
	private String email;
    private String subject;
    private String message;
}
