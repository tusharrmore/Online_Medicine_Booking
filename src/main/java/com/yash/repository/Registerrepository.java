package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Register;
import com.yash.model.User;

@Repository
public interface Registerrepository extends JpaRepository<Register, String> {
	
	public Register findByUserId(String userId);

	public User save(User userdata);

}
