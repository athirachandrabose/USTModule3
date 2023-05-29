package DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeDTO {
	@NotNull
	@Size(min=2,max=10)
	private String name;
	@Size(min=4,max=12)
	private String dept;
	private long id;
	
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
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}
}
