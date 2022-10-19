package com.yash.service;

import com.yash.model.Register;
import com.yash.model.User;


public interface Loginservice {

	public User savedata(User userdata);

	public Register findByUserId(User userdata);

}
