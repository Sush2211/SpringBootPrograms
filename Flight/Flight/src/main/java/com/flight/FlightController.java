package com.flight;

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
public class FlightController {
	@Autowired
	FlightRepository rep;
	
	@PostMapping("/insert")
	public void save(@RequestBody Flight flight) {
		rep.save(flight);
	}
		
	@GetMapping("/getall")
	public List<Flight> getAll(){
		return rep.findAll();
		
	}
	
	@PutMapping("/update")
	public Flight updateFlightById(@RequestParam int id,@RequestBody Flight flight) {
		rep.findById(id);
		return rep.save(flight);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public Optional<Flight>  deleteById(@PathVariable int id){
		rep.deleteById(id);
		return null;
		
	}
	
	

}
