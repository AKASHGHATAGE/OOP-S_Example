package com.oopsexmple.objectclassmethod;

public class ComplexEmployee implements Cloneable{

	
	private int id;
	private String employeeName;
	private int employeeSalary;
	private Department department;
	
	public ComplexEmployee() {
		super();
	}
	
	public ComplexEmployee(int id, String employeeName, int employeeSalary, Department department) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComplexEmployee [id=" + id + ", employeeName=" + employeeName + ", employeeSalary=" + employeeSalary
				+ ", department=" + department + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		ComplexEmployee employeeclonecopy = (ComplexEmployee) super.clone();
		
		Department departmentclonecopy=(Department) employeeclonecopy.getDepartment().clone();
		
		employeeclonecopy.setDepartment(departmentclonecopy);
		
		return employeeclonecopy;
		
		
		
	}
	
}
