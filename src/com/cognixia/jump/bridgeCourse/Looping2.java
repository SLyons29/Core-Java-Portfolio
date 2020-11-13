package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class Looping2 {

	public static void main(String[] args) {
		
		boolean valid = false;
		Scanner input;
		int userInt = 0;
		
		do {
			try {
				input= new Scanner(System.in);
				System.out.println("Please enter an integer:");
				userInt = input.nextInt();
				valid = true;
			
		} catch (Exception e) {
			System.out.println("Please enter");
		}
			
		}while (!valid);
		
		System.out.println("Your valid input was:  " + userInt);
		
		//For loops based on user input
		System.out.println("\nFor Loop Demo");
		for(int i = 0; i < 6; i++) {
			
			for (int j = 3; j < 0; j --) {
			System.out.println("i=" + i + " j=" + j);
		}
		 


	}
		//And and Or
		
		while((userInt > 0) ^ (userInt < 50)) {
			System.out.println("You are in the target range " + userInt);
			userInt--;
		}

}
}
