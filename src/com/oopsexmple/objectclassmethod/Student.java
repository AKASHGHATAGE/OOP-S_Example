package com.oopsexmple.objectclassmethod;

public class Student implements Cloneable{

	private int sid;
	private String studentName;
	private String studentAddress;
	private University university;
	
	
	public Student() {
		super();
	}


	public Student(int sid, String studentName, String studentAddress, University university) {
		super();
		this.sid = sid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.university = university;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public University getUniversity() {
		return university;
	}


	public void setUniversity(University university) {
		this.university = university;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", university=" + university + "]";
	}


	//shallow cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Student studentCloneCopy=(Student) Student.super.clone();
		
		University universityCloneCopy=(University) studentCloneCopy.getUniversity().clone();
		
		studentCloneCopy.setUniversity(universityCloneCopy);
		
		return studentCloneCopy;
		
	}
	
	
	
	
	
	
	
	
}
