package com.cognixia.jump.corejava.Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionsDriver {

	
		//attributes
		static int input = 0;
		static int answer = 0;
		
		public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		int input, answer = 0;
		
		//can be written like the below as well.
		
		
		try {
			inputNumberTest(scan);
			
		}catch(InputMismatchException e) {
			System.out.println("You didnt enter an integer!");
			//e.printStackTrace();
			//input = 0;
		}catch(ArithmeticException e) {
			System.out.println("Illegal operation, you " + e.getMessage());
		//same thing as e.printStackTrae();
		//e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Oops something went wrong");
		}
		finally {
			System.out.println("Finally block prints regardless");
			scan.close();
		}
	}

	public static void inputNumberTest(Scanner scan) throws InputMismatchException, ArithmeticException  {
		int input;
		int answer;
		System.out.println("Type a number ");
		input = scan.nextInt();
		
		
		assert input  > 0 : "Negative Number";
		answer = 10 / input;
		System.out.println(answer);
	}
}
