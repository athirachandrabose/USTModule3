package com.ust.practice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empo")
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String name;
private String dept;
public Employee() {
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
public Employee(long id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}

}
