package com.oopsexmple.objectclassmethod;

public class University implements Cloneable{
	
	private int Uid;
	private String universityName;
	private String universityDepartment;
	
	public University() {
		super();
	}

	public University(int uid, String universityName, String universityDepartment) {
		super();
		Uid = uid;
		this.universityName = universityName;
		this.universityDepartment = universityDepartment;
	}

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityDepartment() {
		return universityDepartment;
	}
	
	public void setUniversityDepartment(String universityDepartment) {
		this.universityDepartment = universityDepartment;
	}

	@Override
	public String toString() {
		return "University [Uid=" + Uid + ", universityName=" + universityName + ", universityDepartment="
				+ universityDepartment + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	

}
