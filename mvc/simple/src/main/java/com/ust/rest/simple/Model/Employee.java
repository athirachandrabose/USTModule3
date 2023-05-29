package com.ust.rest.simple.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private long id;
 private String name;
 private String Designation;
 
public Employee(long id, String name, String designation) {
//	super();
	this.id = id;
	this.name = name;
	this.Designation = designation;
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
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
 public Employee() {
	// TODO Auto-generated constructor stub
}
 
}