package com.example.JewelleryProductDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.JewelleryProductDatabase.Entity.Jewelleryproduct;

@Repository
public interface JewelleryProductRepo extends JpaRepository<Jewelleryproduct, Integer> {

	@Query(value =  "select * from Jewelleryproduct where productname =?" , nativeQuery = true)
	Jewelleryproduct findByName(String productname);
}
