package com.oopsexmple.objectclassmethod;

public class Bus implements Cloneable {

	


	private int busNumber;
	private String busCompnay;
	private int busCapscity;
	private Engine engine;
	
	
	public Bus() {
	
		}
	
	
	public Bus(int busNumber,String busCompnay,int busCapscity,Engine engine)
	{
		super();
		this.busNumber=	busNumber;
		this.busCompnay=busCompnay;
		this.busCapscity=busCapscity;
		this.engine=engine;		
	}
	
	
	public int getBusNumber() {
		return busNumber;
	}
	
	
	public void setBusNumber (int busNumber)
	{
		this.busNumber=busNumber;
	}


	public String getBusCompnay() {
		return busCompnay;
	}


	public void setBusCompnay(String busCompnay) {
		this.busCompnay = busCompnay;
	}


	public int getBusCapscity() {
		return busCapscity;
	}


	public void setBusCapscity(int busCapscity) {
		this.busCapscity = busCapscity;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busCompnay=" + busCompnay + ", busCapscity=" + busCapscity
				+ ", engine=" + engine + "]";
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
    
	
	
	
}
