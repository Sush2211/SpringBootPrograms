package com.mobile;

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
public class MobileController {
	@Autowired
	MobileRepository rep;
	
	@PostMapping("/insert")
	public void save(@RequestBody Mobile mobile){
		rep.save(mobile);
	}
	
	@GetMapping("/getall")
	public List<Mobile> getAll(){
		return rep.findAll();
	}
	
	@PutMapping("/update")
	public Mobile updateMobileById(@RequestParam int id,@RequestBody Mobile mobile) {
		rep.findById(id);
		return rep.save(mobile);
	}
	
	@DeleteMapping("/delete/{id}")
	public Optional<Mobile> deleteById(@PathVariable int id){
		rep.deleteById(id);
		return null;
	}
}
