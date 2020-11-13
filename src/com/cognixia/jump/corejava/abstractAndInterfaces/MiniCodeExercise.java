package com.cognixia.jump.corejava.abstractAndInterfaces;

	public class MiniCodeExercise {

		// Given 2 integers, swap the value of each integer, without using a third temp
		//variable.
		
		public static short difference( short x , short y) {
			short difference = (short) (x - y);
			return difference;
			
			
		int a = 5;
		int b = 10;
			
		// swapping with 3rd variable
			int temp = y;
			y = x;
			x = y;
			System.out.println("x= " + x + " y= " + y);
			
		//without the 3rd
			a = a + b;
			// a is now 15, b is still 10
			b = a - b;
			// b is now 5 , a is 40;
			a = a - a;
			// a is now 10, b is now 5
			System.out.println("a=" + a + " b=" + b);
			
			
			
			
			
			
			
	}

}


