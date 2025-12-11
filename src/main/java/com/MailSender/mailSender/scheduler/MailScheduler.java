package com.MailSender.mailSender.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import com.MailSender.mailSender.service.MailService;

@Component
public class MailScheduler {

    @Value("${mail.default-recipient}")
    private String defaultRecipient;

    private final MailService mailService;

    public MailScheduler(MailService mailService) {
        this.mailService = mailService;
    }

    @Scheduled(fixedRateString = "${mail.interval:10000}")
    public void sendMailEvery10Sec() {
        mailService.sendMail(
                defaultRecipient,
                "Automated Mail",
                "Hello! This mail is auto-sent every 10 seconds."
        );
    }
}
