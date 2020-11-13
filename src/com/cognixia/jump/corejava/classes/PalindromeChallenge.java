package com.cognixia.jump.corejava.classes;

public class PalindromeChallenge {

		// Write a program that checks if a String is a
		// palindrome - yes or no?
		
		public boolean isPalindromeReverseTheString(String text) {
		    StringBuilder reverse = new StringBuilder();
		    String clean = text.replaceAll("\\s+", "").toLowerCase();
		    char[] plain = clean.toCharArray();
		    for (int i = plain.length - 1; i >= 0; i--) {
		        reverse.append(plain[i]);
		    }
		    return (reverse.toString()).equals(clean);
		}
}
		
