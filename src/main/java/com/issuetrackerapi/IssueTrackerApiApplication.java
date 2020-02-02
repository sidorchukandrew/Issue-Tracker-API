package com.issuetrackerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class IssueTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueTrackerApiApplication.class, args);
	}
	
	// STACK IS Java SE for the server

}
