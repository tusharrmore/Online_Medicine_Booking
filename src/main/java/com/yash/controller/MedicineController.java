package com.yash.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Medicine;
import com.yash.service.MedicineServiceI;
import com.yash.serviceimpl.LoginserviceImpl;
import com.yash.serviceimpl.MedicineServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class MedicineController {
	
	private static final Logger log = LoggerFactory.getLogger(MedicineController.class);
	
	@Autowired
	MedicineServiceI ms;
	
//	@Autowired
//	MedicineServiceImpl msi;

	@PostMapping("/savemedi")
	public Medicine saveMedicine(@RequestBody Medicine medi) {
		
		log.info(" In method : saveMedicine in class:MedicineController" +medi);
		
		return ms.saveMedicine(medi);
	}
	
	@GetMapping("/getAllMedi")
	public List<Medicine> findAllMedi() {
		
		log.info(" In method : findAllMedi in class:MedicineController");
		
		return ms.findAllMedi();
	}
	
	@GetMapping("/category/{medicineCategory}")
	public List<Medicine> findByCategory(@PathVariable String medicineCategory) throws Exception {
		
		log.info(" In method : findByCategory in class:MedicineController" +medicineCategory);
		
		return ms.findByCategory(medicineCategory);
	
	}
	
}
