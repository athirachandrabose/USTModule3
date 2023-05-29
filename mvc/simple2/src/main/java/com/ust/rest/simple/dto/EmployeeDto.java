package com.ust.rest.simple.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EmployeeDto {
	@Id
	@GeneratedValue
	@NotNull
	private long id;
	@Size(min=3,max=10)
	 private String name;
	@Size(min=2,max=10)
	 private String Designation;
	 

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	 public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
	
	 
}
