package com.jojuskills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jojuskills.entity.Entity;
import com.jojuskills.service.EmailService;

@RestController
public class EmailController {
 

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendMail")
	public String sentMail(@RequestBody Entity entity) {
		
		String status = emailService.sendSimpleMail(entity);
		return status;
		
	}
	
}
