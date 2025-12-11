package com.MailSender.mailSender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MailSender.mailSender.entity.MailEntity;

@Repository
public interface MailRepository extends JpaRepository<MailEntity, Long> {
	
}
