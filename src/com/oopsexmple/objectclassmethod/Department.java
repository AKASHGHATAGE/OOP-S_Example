package com.oopsexmple.objectclassmethod;

public class Department implements Cloneable {
	
	

	private int deptID;
	private String Depardtment;
	
	public Department() {
		super();
	}

	public Department(int deptID, String depardtment) {
		super();
		this.deptID = deptID;
		Depardtment = depardtment;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDepardtment() {
		return Depardtment;
	}

	public void setDepardtment(String depardtment) {
		Depardtment = depardtment;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", Depardtment=" + Depardtment + "]";
	}
		
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
