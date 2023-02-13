package com.vehicle.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.dto.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	
	public Vehicle findByName(String name);

}
