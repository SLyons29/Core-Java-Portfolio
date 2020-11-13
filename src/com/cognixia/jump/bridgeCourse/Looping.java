package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		
		//initial scanner
		Scanner input = new Scanner(System.in);
		
		//prompt
		System.out.println("Enter an integer:");
		boolean valid; 
		//Stored user input, initialized to -1
		int testing = -1;
		

		
		do {
			input = new Scanner(System.in);
			System.out.println("Enter an integer only:");
			valid =input.hasNextInt();
			if(valid) {
				testing = input.nextInt();
			}
		} while(!valid);
		
		
		System.out.println("You entered valid input of " + testing);
		
		input.close();
		

	}

}
