package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {

		int testCase;

		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Please enter the input");

			testCase = input.nextInt();

			switch (testCase) {

			case 1:
				System.out.println("Hello");
				break;
			case 2:
				System.out.println("See you later.");
				break;
			default:
				System.out.println("Please enter only integerss");
			}

			System.out.println("Your input was: " + testCase);
			input.close();
		} catch (Exception e) {
			System.out.println("You didn't enter a integer");
		}

		testCase = 5;

	}

}
