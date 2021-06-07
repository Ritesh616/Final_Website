package com.Bootcampp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bootcampp.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer>{
	
}