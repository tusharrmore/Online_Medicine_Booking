package com.yash.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito.Then;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import com.yash.model.Medicine;
import com.yash.repository.MedicineRepository;

@RunWith(MockitoJUnitRunner.class)
class MedicineServiceImplTest {


	@InjectMocks
	private MedicineServiceImpl sut;
	
	@Mock
	MedicineRepository rr; 
	
	Medicine medi = new Medicine();
	
	List<Medicine> l=new ArrayList<>();
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void saveMedicine() {
		Mockito.when(sut.saveMedicine(medi)).thenReturn(medi);
		assertEquals(medi, sut.saveMedicine(medi));
	}	
	
	@Test
	public void findAllMediTest() {
		
		Mockito.when(sut.findAllMedi()).thenReturn(l);
	}
	
	@Test
	public void findByCategoryTest() {
		Mockito.when(sut.findAllMedi()).thenReturn(l);
		assertEquals(l, sut.findAllMedi());
	}
}
	

