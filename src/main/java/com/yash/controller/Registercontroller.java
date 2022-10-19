package com.yash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Register;
import com.yash.service.Registerservice;
import com.yash.serviceimpl.LoginserviceImpl;

@RestController
@CrossOrigin(origins = "*")
public class Registercontroller {
	
	private static final Logger log = LoggerFactory.getLogger(Registercontroller.class);
	
	@Autowired
	Registerservice rs;
	
	@PostMapping("/registerdata")
	private Register register(@RequestBody Register r) {
		
		log.info(" In method : register in class:Registercontroller" +r);
		
		return rs.registerdata(r);
		
	}

}
