package com.ust.practice.Controller;

import java.util.List;
import java.util.Optional;

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

import com.ust.practice.DTO.EmployeeDto;
import com.ust.practice.Exception.IdNotFoundException;
import com.ust.practice.Model.Employee;
import com.ust.practice.Repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
@Autowired
EmployeeRepository repo;

@PostMapping("/create")
public ResponseEntity<?> add(@RequestBody @Valid EmployeeDto emp){
	Employee op= new Employee(emp.getId(),emp.getDept(),emp.getName());
			repo.save(op);
	return ResponseEntity.ok().body(op);
}

@GetMapping("/getall")
public ResponseEntity<List<Employee>> getall(){
	List<Employee> op=repo.findAll();
	return ResponseEntity.ok().body(op);
}

@GetMapping("/getall/{id}")
public ResponseEntity<?> getid(@PathVariable Long id) throws IdNotFoundException{
	Optional<Employee> op=repo.findById(id);
	if(op.isPresent()) {
		op.get();
	return ResponseEntity.ok().body(op);
	}
	else
		throw new IdNotFoundException("id not found................");
}

@PutMapping("/update")
public ResponseEntity<?> update(@RequestBody @Valid EmployeeDto emp){
	Employee op=new Employee(emp.getId(),emp.getDept(),emp.getName());
			repo.save(op);
	return ResponseEntity.ok().body(op);
}

@PutMapping("/update/{id}")
public ResponseEntity<?> updateid(@PathVariable Long id,@RequestBody @Valid EmployeeDto emp) throws IdNotFoundException{
	Employee em=null;
	Employee empl=null;
	Optional<Employee> op=repo.findById(id);
	if(op.isPresent()) {
		em=op.get();
	em.setDept(emp.getDept());
	em.setName(emp.getName());
	empl=repo.save(em);
	return ResponseEntity.ok().body(empl);
	}else
		throw new IdNotFoundException("id not .....found..........");
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable Long id) throws IdNotFoundException{
	Optional<Employee> op=repo.findById(id);
	if(op.isPresent()) {
		repo.deleteById(id);
		return ResponseEntity.ok().body("deleted..........");
	}
	else
		throw new IdNotFoundException("No id found for deletion");
	
}
}
