package com.Bootcampp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bootcampp.dao.EmailRepository;
import com.Bootcampp.model.Email;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	EmailRepository emailRepository;
	
	
	@Override
	public boolean saveEmail(Email email) {
 
		try {
		Email savedEmail = emailRepository.save(email);
		if(savedEmail!= null) {
			return true;			
		}else {
			return false;
		}
		}catch(Exception e) {
		}
		return false;
		
	}


	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}

	