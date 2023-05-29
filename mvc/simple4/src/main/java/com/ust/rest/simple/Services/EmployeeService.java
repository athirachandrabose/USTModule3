package com.ust.rest.simple.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.simple.Model.Employee;
import com.ust.rest.simple.Repository.EmployeeRepository;



@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
	
//create
	public boolean createEmployee(Employee emp) {
		repo.save(emp);
		return true;
	}

//fetch by id
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		Optional<Employee>opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
			return null;
	}

//fetch all
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

//update
	public Employee updateEmployeeDetails(long id, Employee emp) {
		// TODO Auto-generated method stub
		Optional<Employee>opt=repo.findById(id);
		if(opt.isPresent()) {
			 opt.get();
			 return repo.save(emp);
		}
		else
			return null;
		
	}

//delete
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	

	

}