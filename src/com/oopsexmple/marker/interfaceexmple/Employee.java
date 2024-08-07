package com.oopsexmple.marker.interfaceexmple;

import javax.management.RuntimeErrorException;

public class Employee implements Deleteable{

	private  int  Eid;
	private  String employeeName;
	
	
	
	public Employee(int eid, String employeeName) {
		super();
		Eid = eid;
		this.employeeName = employeeName;
	}


	public Employee() {
	}


	public int getEid() {
		return Eid;
	}


	public void setEid(int eid) {
		Eid = eid;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", employeeName=" + employeeName + "]";
	}
	
	
	public void delete() {
		
		if(!(this instanceof Deleteable))
		{
			System.out.println("Error .... Can not be delete the this objects !!!");
			
			throw new RuntimeException("DeleteNotSupportedException occurred");
			
		}
		
		System.out.println("Student object deleted successfully!!");
	}
	
}
