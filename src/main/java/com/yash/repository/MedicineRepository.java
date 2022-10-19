package com.yash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.yash.model.Medicine;

@EnableJpaRepositories
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

	List<Medicine> findByMedicineCategory(String medicineCategory);

	
	
}
