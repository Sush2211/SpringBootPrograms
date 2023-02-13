package com.cycle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	CycleRepository ref;
	
	@PostMapping("/save")
	public void Cycle(@RequestBody Cycle cycle) {
		ref.save(cycle);
		
	}
	
	@GetMapping("/getAll")
	public List<Cycle> getAll(){
		return ref.findAll();	
	}
	
	@GetMapping("/get")
	public Optional<Cycle> get(@RequestParam int id) {
		return ref.findById(id);
		
	}
	
	@PutMapping("/update")
	public Cycle update(@RequestBody Cycle aeroplane, @RequestParam int id) {
		ref.findById(id);
		return ref.save(aeroplane);
	}
	
	@DeleteMapping("/delete")
	public Optional<Cycle> delete(@RequestParam int id) {
		ref.deleteById(id);
	   return null;	
	}
	
	@DeleteMapping("/deleteAll")
	public Optional<Cycle> deleteAll(){
		ref.deleteAll();
		return null;
		
		
	}

}
