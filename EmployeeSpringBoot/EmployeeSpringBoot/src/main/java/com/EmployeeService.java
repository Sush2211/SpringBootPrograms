package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository emprep;
	
	public void save(Employee employee) {
		emprep.save(employee);
	}
	
//	public Employee saveEmployee(@RequestBody Employee employee) {
////		return repository.save(employee);
////	}
	
	
	public void get() {
		emprep.findAll();
	}
	
//	public List<Employee> getAll(){
//		return repository.findAll();
//	}
//	

}
