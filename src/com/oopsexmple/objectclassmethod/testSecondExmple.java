package com.oopsexmple.objectclassmethod;

public class testSecondExmple {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		University university=new University(101,"Savitribai Phule Pune university ", "Computer Department");
		
		System.out.println("Orignal Information");
		
		System.out.println(university);
		Student student=new Student(51,"Akash", "Kolhapur", university);
		System.out.println(student);
		
		System.out.println("<<<<<<<---------Shollow Cloning  --------->>>>>>>>");
		Student cloneStudent =(Student) student.clone();
		System.out.println("shallow copy =" + cloneStudent );
		System.out.println("Hashcode for wihoutclone object =" + student.hashCode());	
		System.out.println("Hashcode for afther cloning the object  =" + cloneStudent.hashCode());
		
		System.out.println("Refference equallity =" + (student==cloneStudent));
		
		
		System.out.println("<<<<<<<---------Deep Cloning  --------->>>>>>>>");
		student.getUniversity().setUniversityDepartment("BA");
		System.out.println("Before Cloning = "+student);
		System.out.println("AFther Deep Cloning = "+cloneStudent);
	
		
		
		
		
	}
}
