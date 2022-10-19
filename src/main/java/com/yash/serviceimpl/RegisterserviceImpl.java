package com.yash.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Register;
import com.yash.repository.Registerrepository;
import com.yash.service.Registerservice;
@Service
public class RegisterserviceImpl implements Registerservice{

	private static final Logger log = LoggerFactory.getLogger(RegisterserviceImpl.class);
	
	
	@Autowired
	Registerrepository rr;
	
	@Override
	public Register registerdata(Register r) {
		
		log.info(" In method : registerdate in class : RegisterserviceImpl "+r);
		
		return rr.save(r);
	}

}
