package com.oopsexmple.objectclassmethod;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		Engine engine = new Engine(1, "v24", 21211);

		Bus b1 = new Bus(1212, "Tata", 40, engine);
		System.out.println(b1);

		//System.out.println(b1.hashCode());
		 

		Bus b2 = (Bus) b1.clone();
		System.out.println(b2);

	}

}
