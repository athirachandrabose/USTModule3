package com.ust.practice.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeDto {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@NotNull
private long id;
@NotNull
@Size(min=3,max=10)
private String name;
@Size(min=2,max=8)
private String dept;
public EmployeeDto() {
	// TODO Auto-generated constructor stub
}
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public EmployeeDto(long id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}

}
