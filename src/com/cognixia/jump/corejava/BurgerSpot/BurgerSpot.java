package com.cognixia.jump.corejava.BurgerSpot;

import java.util.Scanner;

public class BurgerSpot {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Hello there! Welcome to BurgerJoint! What type of burger would you like? Please Select  1 = American Burger , 2 = Bacon Burger, 3 = Vegan Burger");
		int answer = input.nextInt();

		Cook masterCook = new Cook();
		if (answer == 1) {
			Burger orderBurger = masterCook.makeAmericanBurger();
			System.out.println("Heres your American burger! Thank you, come again!");

		}
		if (answer == 2) {
			Burger orderBurger = masterCook.makeBaconBurger();
			System.out.println("Heres your Bacon burger! Nothing like the taste of bacon!");
		}
		if (answer == 3) {
			Burger orderBurger = masterCook.makeVeganBurger();
			System.out.println("Heres your Vegan burger! Healthy choice indeed!");
		}
		if (answer != 1 && answer != 2 && answer != 3) {
			System.out.println("If you do not want a burger, you have come to the wrong place.");
		}

		else {
			System.out.println("We hope you have a great day! Goodbye now.");

		}
		input.close();
	}

}

