package com.yash.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.yash.model.Register;
import com.yash.repository.Registerrepository;

@RunWith(MockitoJUnitRunner.class)
class RegisterserviceImplTest {


	@InjectMocks
	private RegisterserviceImpl sut;

	@Mock
	Registerrepository rr;
	
	Register register = new Register();
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void registerdata() {
		
		Mockito.when(sut.registerdata(register)).thenReturn(register);
		assertEquals(register, sut.registerdata(register));		
	}
	
}
