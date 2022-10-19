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

import com.yash.model.Medicine;
import com.yash.service.MedicineServiceI;

@RunWith(MockitoJUnitRunner.class)
class MedicineControllerTest {

	@InjectMocks
	private MedicineController sut;
	
	@Mock
	MedicineServiceI ms;
	
	Medicine medi = new Medicine();
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void saveMedicine() {
		
		Mockito.when(sut.saveMedicine(medi)).thenReturn(medi);
		assertEquals(medi, sut.saveMedicine(medi));
		
	}

}
