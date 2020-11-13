package com.cognixia.jump.corejava.BurgerSpot;

public class Cook {

	//Attributes
	private String name;
	private String speciality;
	private int experience;
	
	//Constructors 
	//Default constructor below(good practice)
	public Cook() {
		this.setName("");
		this.setSpeciality("");
		this.setExperience(0);
	}
	//Constructor written completely out.
	public Cook(String name, String speciality, int experience) {
		super();
		this.setName(name);
		this.setSpeciality(speciality);
		this.setExperience(experience);
	}
	
	public Burger makeAmericanBurger() {
//		Burger newBurg = new Burger();
		Burger aBurg = new Burger(true, true, true, true, true, true, true, false);
		return aBurg;
		
	}

	public Burger makeBaconBurger() {
//		Burger newBurg = new Burger();
		Burger bBurg = new Burger(true, true, true, true, true, true, true, true );
		return bBurg;
	}
	public Burger makeVeganBurger() {
//		Burger vBurg = new Burger();
		Burger vBurg = new Burger(false, true, true, true, true, true, false, true);
		return vBurg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

}
