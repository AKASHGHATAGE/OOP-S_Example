package com.oopsexmple.objectclassmethod;

public class TestDeepcloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		

		Department department=new Department(1, "Account");		
		System.out.println(department);
		
		
		ComplexEmployee orignalEmployee=new ComplexEmployee(101,"Ram", 122220, department);
		System.out.println("Orignal Employee Information = "+orignalEmployee);
		
		
		ComplexEmployee clonedEmployee =(ComplexEmployee) orignalEmployee.clone();
		System.out.println("Cloned Employee = "+clonedEmployee );
		
		System.out.println("Hashcode of orignal employee = "+orignalEmployee.hashCode());
		System.out.println("Hashcode of cloned employee = "+clonedEmployee);
		
		
		System.out.println("Reference equllity  = "+(orignalEmployee==clonedEmployee));
		
		
		System.out.println("<<<<< Afther Chaning the Department of Original Employee >>>>>>>");
		
		orignalEmployee.getDepartment().setDepardtment("IT");
		
		System.out.println("Original Employee after change in Department : "+orignalEmployee);
		System.out.println("Cloned Employee after change in Department of Original Employee: "+clonedEmployee);
	}
	
	

}
