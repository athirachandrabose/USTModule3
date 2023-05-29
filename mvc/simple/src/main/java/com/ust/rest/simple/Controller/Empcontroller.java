package com.ust.rest.simple.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.simple.Model.Employee;
import com.ust.rest.simple.Services.Servicesimpl;

@RestController
@RequestMapping("/emp")
public class Empcontroller {

	@Autowired
	private Servicesimpl services;
	
	@PostMapping("/emp1")
	public Employee post(@RequestBody Employee emp) {
		return services.create(emp);
	}
	
	@GetMapping("/emp2")
	public List<Employee> get() {
		return services.getall();
	}
	
	@GetMapping("/emp2/{id}")
	public Employee getid(@PathVariable Long id) {
		return services.getbyid(id);
	}
	
	@PutMapping("/emp3")
	public Employee update(@RequestBody Employee empl) {
		return services.update(empl);
	}
	@PutMapping("/emp3/{id}")
	public Employee updateid(@PathVariable Long id,@RequestBody Employee e) {
		Employee updated=services.updatebyid(id, e);
		return updated;
	}
	
	@DeleteMapping("/emp4/{id}")
	public void del(@PathVariable Long id) {
		 services.delete(id);
	}
}
