package com.cognixia.jump.corejava.BurgerSpot;

public class Burger {
	boolean hasBun;
	boolean hasMayo;
	boolean hasKetuchup;
	boolean hasMustard;
	boolean hasCheese;
	boolean hasPickles;
	boolean hasBeef;
	boolean hasBacon;
	
	//what is called when "makeBurger" is entered.
	public Burger() {
		super();
		this.hasBun = true;
		this.hasMayo = true;
		this.hasKetuchup = true;
		this.hasMustard = true;
		this.hasCheese = true;
		this.hasPickles = true;
		this.hasBeef = true;
		this.hasBacon = true;
	}


	public Burger(boolean hasBun, boolean hasMayo, boolean hasKetuchup, boolean hasMustard, boolean hasCheese,
			boolean hasPickles, boolean hasBeef, boolean hasBacon) {
		super();
		this.hasBun = hasBun;
		this.hasMayo = hasMayo;
		this.hasKetuchup = hasKetuchup;
		this.hasMustard = hasMustard;
		this.hasCheese = hasCheese;
		this.hasPickles = hasPickles;
		this.hasBeef = hasBeef;
		this.hasBacon = hasBacon;
	}





	@Override
	public String toString() {
		return "Burger [hasBun=" + hasBun + ", hasMayo=" + hasMayo + ", hasKetuchup=" + hasKetuchup + ", hasMustard="
				+ hasMustard + ", hasCheese=" + hasCheese + ", hasPickles=" + hasPickles + ", hasBeef=" + hasBeef + ", hasBacon=" + hasBacon + "]";
	}

	
}
