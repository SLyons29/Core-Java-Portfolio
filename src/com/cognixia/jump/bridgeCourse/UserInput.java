package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		//create scanner object [scanner is a class]
		// input is the variable
		Scanner input = new Scanner(System.in);
		
		//to initialize the scanner you would type the below
		// Scanner input; // = new Scanner(System.in);
		//or 
		// Scanner input;
		
		// System.in [".in" stands for input]
		
		
		
		
		
		//prompt user for input
		String prompt = "Hello please enter a boolean";
		System.out.println(prompt);	
		
		
		
		
		//read from the console
			//Strings
			//String storage = input.nextLine();
		
			//Boolean
			boolean bool = input.nextBoolean();
		
//			//Byte
//			byte inByte = input.nextByte();
//		
//			//Double
//			double inDouble = input.nextDouble();
//			
//			//Float
//			float inFloat = input.nextFloat();
//			
//			//Int
//			int inInt = input.nextInt();
//			
//			//Long
//			long inLong = input.nextLong();
//			
//			//Short
//			short inShort = input.nextShort();
			
			
		
		
		//Output our user input
		System.out.println(bool);
		
		
		
		//Close the scanner
		input.close(); //this ensures that at the end of the
						// program, the scanner is no longer used
		
		

	}

}
