package com.cognixia.jump.corejava.arraysAndCollections;

public class StringsDriver {

	public static void main(String[] args) {
		
		//We're going to make some strings a few different ways to show
		//the string pool default memory handling and the explicit heap usage with
		//the new keyword and a String() constructor
		
		String str1 = "str1"; // not in pool so an object is made
		String str2 = "str1"; // already there, so still only one object pool with 2 pointers
		String str3 = "str3"; // not in pool, we make a new object
		
		String str4 = new String("str4"); // regardless of value, we are in main heap
		String str5 = new String("str1"); // ", we could have spaced by using string pool
		String str6 = "str1"; // this is using the string pool
		
		//Then we'll try to compare and reference those strings to one another and see
		//the proper and improper ways to do that because we now understand the memory
		System.out.println(str1 == str2); // == between strings compares address
		System.out.println(str1 == str5); // false - addresses are different
		System.out.println(str1 == str6);
		System.out.println(str1.equals(str5));
		System.out.println(str1.hashCode() == str2.hashCode());
		System.out.println(str2.hashCode() == str5.hashCode());
		System.out.println(str2.hashCode());

	}

} 