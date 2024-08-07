package com.oopsexmple.marker.interfaceexmple;

public class TestCustomMarkerInterface {

	
	public static void main(String[] args) {
		
		Employee employee=new Employee(1,"Akash Ghatage" );
		
		System.out.println(employee);
		
		employee.delete();
		
		System.out.println(employee.hashCode());
		
		
	}
}