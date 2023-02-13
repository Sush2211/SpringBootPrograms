package com;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Integer>{
	
	public Bike findByBrand(String brand);

}
