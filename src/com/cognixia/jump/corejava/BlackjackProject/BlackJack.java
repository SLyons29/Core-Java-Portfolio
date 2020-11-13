package com.cognixia.jump.corejava.BlackjackProject;

import java.util.Scanner;

public class BlackJack {

//The user must be able to type using the keyboard to make game selections
//The game will played with 1 human (user) and the house (1 computer)
//You only need to implement logic for 'hit' or 'stand'
//You do not need to do 'split' , 'insurance' or any other advanced rules
//		or moves for Black Jack.
//The game is played on 1 single DECK of 52 Playing Cards, no Jokers
//As cards are played to the player and the House, remember to remove them from
//		the deck (no duplicate cards)
//Implement random drawing and playing of cards
//Each game is done win either the house or the player wins.  Your program should
//Start a new game and run a new game indefinitely, until the player chooses to
//		 stop playing
//You do not need to take bets or track currency
//After every game move - ie. dealing cards, choosing hit or stand, etc.
//		the program should print the House Cards and player cards to the console,
//		as well as any instructions if it's time to choose a move in the game.

	public static void main(String[] args) {

		boolean playerPlays = true;

		boolean playerWins = true;

		boolean playerLooses = true;

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Welcome to Shanequa's Blackjack Casino! Would you like to play? Enter 1 = yes  Or Enter 2 = no");
		int answer = input.nextInt();

		if (answer == 1) {
			System.out.println("Lets play!");
			
		}
		else {
			System.out.println("Thats unfortuante! Have a great rest of your day.");
		}
		input.close();
		
		


	}
	
}
