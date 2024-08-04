package com.oopsexmple.objectclassmethod;

public class Engine {

	private int enginID;
	private String enginName;
	private int cc;

	public Engine() {
		super();
	}

	public Engine(int enginID, String enginName, int cc) {
		super();
		this.enginID = enginID;
		this.enginName = enginName;
		this.cc = cc;
	}

	public int getEnginID() {
		return enginID;
	}

	public void setEnginID(int enginID) {
		this.enginID = enginID;
	}

	public String getEnginName() {
		return enginName;
	}

	public void setEnginName(String enginName) {
		this.enginName = enginName;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [enginID=" + enginID + ", enginName=" + enginName + ", cc=" + cc + "]";
	}
	
	
	
	
	

}
