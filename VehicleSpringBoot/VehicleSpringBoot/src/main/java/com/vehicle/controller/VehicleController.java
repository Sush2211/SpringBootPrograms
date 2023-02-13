package com.vehicle.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vehicle.dao.VehicleRepository;
import com.vehicle.dto.Vehicle;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleRepository repository;
	
	@PostMapping("/insert")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		return repository.save(vehicle);
	}
	
	@GetMapping("/getAll")
	public List<Vehicle> getAll(){
		return repository.findAll();
		
	}
	
	@GetMapping("/get")
	public Optional<Vehicle> getById(@RequestParam int id) {
		return repository.findById(id);
	}
	
	@GetMapping("/get/{name}")
	public Vehicle getByName(@PathVariable String name) {
		return repository.findByName(name);
		
	}
	
	@PutMapping("/update")
	
	public Vehicle updateById(@RequestParam int id,@RequestBody Vehicle vehicle) {
		repository.findById(id);
		return saveVehicle(vehicle);
		
	}
	
	@DeleteMapping("/delete")
	public Optional<Vehicle> delete(@RequestParam int id) {
	   repository.deleteById(id);
	   return null;	
	}
	
	

}
