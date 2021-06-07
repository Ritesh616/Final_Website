package com.Bootcampp.controller;

import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bootcampp.model.Email;
import com.Bootcampp.service.EmailService;

@RestController
@RequestMapping(path="/email")
public class EmailController{
	
	
	@Autowired
	EmailService emailService;
	
	
	@PostMapping(path="/save")
	public ResponseEntity<String> saveEmails(@RequestBody Email email) {
		if(emailService.saveEmail(email)) {
			return new ResponseEntity<>("Email saved", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Email falied to save", HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

}