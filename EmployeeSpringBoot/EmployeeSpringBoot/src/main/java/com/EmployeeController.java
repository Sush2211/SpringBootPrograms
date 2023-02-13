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
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	
//	@PostMapping("/insert")
//	public Employee saveEmployee(@RequestBody Employee employee) {
//		return repository.save(employee);
//	}
	
	@PostMapping("/insert")
	public int saveEmp(@RequestBody Employee employee) {
		repository.save(employee);
		return employee.getId();
	}
	
	@GetMapping("/getById")
	public Optional<Employee> get(@RequestParam int id){
		return repository.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return repository.findAll();
	}
	
	
//	@GetMapping("/getAll")
//	public int getEmp(){
//		repository.findAll();
//		return 0;
//		
//	}
	@GetMapping("/get/{emailId}")
	public Employee getByEmailId(@PathVariable String emailId) {
		return repository.findByEmailId(emailId);
	}

	
	@PutMapping("/update")
	public Employee updateEmployeeById(@RequestParam int id,@RequestBody Employee employee) {
		repository.findById(id);
		return repository.save(employee);
	}
	
	@DeleteMapping("/delete")
	public Optional<Employee> delete(@RequestParam int id) {
	   repository.deleteById(id);
	   return null;	
	}
	
	@DeleteMapping("/deleteAll")
	public Optional<Employee> deleteAll(){
		repository.deleteAll();
		return null;
		
		
	}
	

}
