package com.ust.rest.simple.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.ust.rest.simple.dto.EmployeeDto;

@RestController
@RequestMapping("/emp")
public class Empcontroller {

	@Autowired
	private Servicesimpl services;
	
	@PostMapping("/emp1")
	public ResponseEntity<?> post(@RequestBody @Valid EmployeeDto empd) {
		return new ResponseEntity<>(services.create(empd),HttpStatus.CREATED);
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
	
	@DeleteMapping("/emp4/{id}")
	public void del(@PathVariable Long id) {
		 services.delete(id);
	}
}
