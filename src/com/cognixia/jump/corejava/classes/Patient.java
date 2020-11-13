package com.cognixia.jump.corejava.classes;

public class Patient {
	
	//Attributes
	private String name;
	private int temperature;
	private boolean sick;
	
	//Constructor
	public Patient() {
		this.name = "";
		this.temperature = 0;
		this.sick = false;
	}
	//Overloaded Constructor (just another option)
	public Patient(String name, int temperature, boolean sick) {
		this.name = name;
		this.temperature = temperature;
		this.sick = sick;
	}
	
	//Methods
	public boolean getSick() {
		return sick; 
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public String getName() {
		return name;
	}
	
	// Special Methods - getters and Setters
	public void setName(String nam) {
		this.name = nam;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void setSick(boolean sick ) {
		this.sick = sick; 
		
	}

}