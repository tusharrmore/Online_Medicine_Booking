package com.yash.serviceimpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.yash.model.Register;
import com.yash.model.User;
import com.yash.repository.Loginrepository;
import com.yash.repository.Registerrepository;

@RunWith(MockitoJUnitRunner.class)
class LoginserviceImplTest {

	@InjectMocks
	private LoginserviceImpl sut;
	
	@Mock
	private Loginrepository loginrepo;
	
	@Mock
	Registerrepository rr;
	
//	private User user;
	
	User user = new User();
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
	}

	@Test
	public void saveDataTest() {
		
		Mockito.when(sut.savedata(user)).thenReturn(user);
	}
	
	@Test
	public void findByUserId() {
		Register register= new Register();
		Mockito.when(sut.findByUserId(user)).thenReturn(register);
	}
	
	

}
