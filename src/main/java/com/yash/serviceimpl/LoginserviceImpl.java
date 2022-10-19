package com.yash.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Register;
import com.yash.model.User;
import com.yash.repository.Registerrepository;
import com.yash.service.Loginservice;

@Service
public class LoginserviceImpl implements Loginservice {
	
	
	private static final Logger log = LoggerFactory.getLogger(LoginserviceImpl.class);

	@Autowired
//	Loginrepository rr;
	Registerrepository rr;

	@Override
	public User savedata(User userdata) 
	{
		log.info(" In method : savedata in class:LoginserviceImpl" +userdata);
		return rr.save(userdata) ;
	}

//	@Override
//	public User findByUserId(User user) {
//		// TODO Auto-generated method stub
//		log.info(" In method : findByUserId in class : LoginserviceImpl ")
//		return rr.findByUserId(user.getUserId());
//	}
	
	@Override
	public Register findByUserId(User user) {
		// TODO Auto-generated method stub
		log.info(" In method : findByUserId in class : LoginserviceImpl "+user);
		return rr.findByUserId(user.getUserId());
	}

}
