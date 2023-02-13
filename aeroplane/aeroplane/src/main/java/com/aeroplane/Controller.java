package com.aeroplane;

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
	AeroplaneRepository ref;
	
	@PostMapping("/save")
	public void Aeroplane(@RequestBody Aeroplane aeroplane) {
		ref.save(aeroplane);
		
	}
	
	@GetMapping("/getAll")
	public List<Aeroplane> getAll(){
		return ref.findAll();	
	}
	
	@GetMapping("/get")
	public Optional<Aeroplane> get(@RequestParam int id) {
		return ref.findById(id);
		
	}
	
	@PutMapping("/update")
	public Aeroplane update(@RequestBody Aeroplane aeroplane, @RequestParam int id) {
		ref.findById(id);
		return ref.save(aeroplane);
	}
	
	@DeleteMapping("/delete")
	public Optional<Aeroplane> delete(@RequestParam int id) {
		ref.deleteById(id);
	   return null;	
	}
	
	@DeleteMapping("/deleteAll")
	public Optional<Aeroplane> deleteAll(){
		ref.deleteAll();
		return null;
		
		
	}

}
