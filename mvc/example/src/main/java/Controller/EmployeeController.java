package Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DTO.EmployeeDTO;
import Model.Employee;
import Repositories.EmployeeRepos;
import Services.ServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
@Autowired
private ServiceImpl services;
public Employee createEntity(EmployeeDTO em) {
	Employee e=new Employee();
	e.setId(em.getId());
	e.setDept(em.getDept());
	e.setName(em.getName());
	return e;
}
public EmployeeDTO createDto(Employee em) {
	EmployeeDTO e=new EmployeeDTO();
	e.setId(em.getId());
	e.setDept(em.getDept());
	e.setName(em.getName());
	return e;
}
@PostMapping
@RequestMapping("/create")
public ResponseEntity<EmployeeDTO> save(@RequestBody EmployeeDTO ed){
	var e=createEntity(ed);
	e=services.save(e);
	ed=createDto(e);
	return ResponseEntity.status(HttpStatus.CREATED).body(ed);
	}
}
