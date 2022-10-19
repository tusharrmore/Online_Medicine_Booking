package com.yash.service;

import java.util.List;

import com.yash.model.Medicine;	

public interface MedicineServiceI {
	
	public Medicine saveMedicine(Medicine mdata);  
	
	List<Medicine> findAllMedi();

	public List<Medicine> findByCategory(String medicineCategory);

}
