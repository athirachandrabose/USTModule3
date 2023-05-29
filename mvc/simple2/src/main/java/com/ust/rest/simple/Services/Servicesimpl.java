package com.ust.rest.simple.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.simple.Model.Employee;
import com.ust.rest.simple.Repository.EmpRepo;
import com.ust.rest.simple.dto.EmployeeDto;

@Service
public class Servicesimpl {
@Autowired
private EmpRepo repo;

	public Employee create(@Valid EmployeeDto empd) {
		// TODO Auto-generated method stub
		Employee em= new Employee(empd.getId(),empd.getName(),empd.getDesignation());
		return repo.save(em);
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

	

}
