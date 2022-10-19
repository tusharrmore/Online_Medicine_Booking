package com.yash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Register;
import com.yash.model.User;
import com.yash.repository.Loginrepository;
import com.yash.service.Loginservice;
import com.yash.serviceimpl.LoginserviceImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class Logincontroller {

	private static final Logger log = LoggerFactory.getLogger(Logincontroller.class);
	
	@Autowired
	Loginservice  rs;
	
	
	@PostMapping("/login")
	public User  Login(@RequestBody User userdata)
		{
			log.info(" In method : Login in class:Logincontroller" +userdata);
			return rs.savedata(userdata);
	}

//	@PostMapping("/login")
//   public ResponseEntity<?> loginUser(@RequestBody User userData){
//        log.info("userData");
//        Register user = repo.findByUserId(userData.getUserId());
//        if(user.getPassword().equals(userData.getPassword()))
//            return ResponseEntity.ok(user);
//        return (ResponseEntity<?>) ResponseEntity.internalServerError();
//    }
//	
	
	@PostMapping("/verify")
	public Register VerifyCred(@RequestBody User userdata)
		{
		
//		User u=new User();
		Register u=null;
				u=rs.findByUserId(userdata);
				log.info("login cred "+u);
		if(u.getUserId().equals(userdata.getUserId()) && u.getPassword().equals  (userdata.getPassword())) {
				log.info("login cred correct");
		
		}
		else {
			throw new RuntimeException("Invalid Credentials");
		}
		log.info(" In method : VerifyCred in class:Logincontroller" +userdata);
		return u;		
	}
}
