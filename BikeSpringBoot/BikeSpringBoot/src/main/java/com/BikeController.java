package com;

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

@RestController
public class BikeController {
	@Autowired
	BikeRepository repository;
	
	@PostMapping("/insert")
	public Bike saveBike(@RequestBody Bike bike) {
		return repository.save(bike);
	}
	
	@GetMapping("/getAll")
	public List<Bike> getAll() {
		return repository.findAll();
	}
	
	@GetMapping("/get")
	public Optional<Bike> get(@RequestParam int id){
		return repository.findById(id);
	}
	
	@GetMapping("/get/{brand}")
	public Bike getByBrand(@PathVariable String brand) {
		return repository.findByBrand(brand);
		
	}
	
	@PutMapping("/update")
	public Bike updateBikeById(@RequestParam int id,@RequestBody Bike bike) {
		repository.findById(id);
		return repository.save(bike);
	}
	
	@DeleteMapping("/delete")
	public Optional<Bike> delete(@RequestParam int id){
		repository.deleteById(id);
		return null;
	}
	
	@DeleteMapping("/deleteAll")
	public List<Bike> deleteAll(){
		repository.deleteAll();
		return null;
		
	}
	
}
