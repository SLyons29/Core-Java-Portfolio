package com.cognixia.jump.bridgeCourse;

import java.lang.Math;

public class HelloWorld {

	public static void main(String[] args) {
		// This is commented code
		
		/* this is a continued comment
		 * 
		 * this is also commented code
		 */
		
//		I want to comment all of this text
//		which is not valid code, but needed for
//		readability
		
		System.out.println("Hello, World");
		System.out.println("Hello new world");
		
		//Concatenating = combining 
		
		System.out.println("Hello World" + " I'm not done yet.");
		
		//The below print line performs addition because the numbers have not been 
		// Specified with "" marks
		System.out.print(25 + 5);
		
		//Change the behavior of the numbers by adding "" marks
		System.out.print("  25" + '5');
		
		
		//The behavior of the "+" sign is defined by what proceeds it.
		//What returns is the character value of 5. The ASCII value of 5 is 53.
		System.out.println(25 + '5');
		
		
		//This is the correct way code must be written--reading from top down.
		//This is called declaration (telling program that we have a "short" called ourShort
		short ourShort;
		
		//Initialization or assignment is below.
		
		ourShort = 4;
		
		//2 line declaration and initialization
		short ourShort1;
		ourShort1 = 4;

		
		//Java Primitives
		
		//Numerical Primitives
		short ourShort2 = 1;
		byte ourByte = 1;
		int ourInt = 1;
		long ourLong = 1;
		float ourFloat = 1.0f;
		double ourDouble = 1.0d;
		
		//text
		char ourChar = 'a';
		
		// logical primitive
		boolean ourBool = true;
		
		
		//Java Constants (cannot be changed or reassigned)
		//Add final to method
		//Limiting to 1 assignment for a final datatype
		
		
//		final int ourInt= 1;
//		
//		ourInt = 5;
//		
//		//Casting variables 
//		
//		//Automatically (not good practice)
//		int ourInt  = 5;
//		
//		double ourDouble = (double) ourInt;
//		
//		System.out.println(ourDouble);
		
		
		
		//Explicit (best practice)
		
		//Test Values
		int intA = 5;
		int intB = 10;
		int intC = 5;
		int intD = 23;
		int intE = 8;
		int intF = 3;
		boolean t0rF = true;
		
		
		//Operators
			// = Assignment
			//intA = 2;
			
			// ! not operator
			boolean not = !t0rF;
			
			//increment and decrement
			intA++; 
			intB+=5;  //or you can write it this way below
			intB = intB + 5;
			
			intA-=5;
			
			//Sample our Output
			System.out.println("Division " + intB / intA);
			
			//Arithmetic
			intC = 2;
			intD = 3;
			intE = 8;
			intF = 3;
			
			intE /=2;
			
			//Exponents in Java [what to do & how to write listed below]
			// go to top & write import  java.lang.Math
			// write Math.pow(base, power);
			System.out.println(Math.pow(2,3));
			System.out.println(Math.pow(intC, intD)); 
			System.out.println("Exponent Example  " + intE);
			
			// or multiply equals
			
			intC *= 5;
			System.out.println(intC);
	}
	
	

}
