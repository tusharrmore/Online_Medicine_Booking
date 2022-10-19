package com.yash.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.yash.model.User;
import com.yash.repository.Loginrepository;
import com.yash.service.Loginservice;

@RunWith(MockitoJUnitRunner.class)
class LogincontrollerTest {

	@InjectMocks
	private Logincontroller sut;

	@Mock
	Loginservice loginservice; 
	
	User user = new User();
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void Login() {
		
		Mockito.when(sut.Login(user)).thenReturn(user);
		assertEquals(user, sut.Login(user));
		
	}
	
}
