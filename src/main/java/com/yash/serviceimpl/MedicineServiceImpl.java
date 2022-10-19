package com.yash.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Medicine;
import com.yash.repository.MedicineRepository;
import com.yash.service.MedicineServiceI;

@Service
public class MedicineServiceImpl implements MedicineServiceI {

	private static final Logger log = LoggerFactory.getLogger(MedicineServiceImpl.class);
	
	@Autowired
	MedicineRepository mr;
	
	@Override
	public Medicine saveMedicine(Medicine mdata) {
		
		log.info(" In method : saveMedicine in class : MedicineServiceImpl "+mdata);
		
		return mr.save(mdata);
	}

	@Override
	public List<Medicine> findAllMedi() {
		
		log.info(" In method : findAllMedi in class : MedicineServiceImpl ");
		
		return mr.findAll();
	}

	@Override
	public List<Medicine> findByCategory(String medicineCategory) {
		
		log.info(" In method : findByCategory in class : MedicineServiceImpl "+medicineCategory);
		
		return mr.findByMedicineCategory(medicineCategory);
	}
	
}
