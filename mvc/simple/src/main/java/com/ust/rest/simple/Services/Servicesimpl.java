package com.ust.rest.simple.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.simple.Model.Employee;
import com.ust.rest.simple.Repository.EmpRepo;

@Service
public class Servicesimpl {
@Autowired
private EmpRepo repo;

	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Employee getbyid(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public Employee update(Employee empl) {
		// TODO Auto-generated method stub
		return repo.save(empl);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		
	}

	public Employee updatebyid(Long id,Employee e) {
		// TODO Auto-generated method stub
		Employee emplo=repo.findById(id).orElse(null);
		emplo.setName(e.getName());
		emplo.setDesignation(e.getDesignation());
		Employee update=repo.save(emplo);
		return update;
	}

	

}
