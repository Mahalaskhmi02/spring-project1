package com.jojuskills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSentApplication.class, args);
		System.out.println("Spring boot mail sending");
	}

}
