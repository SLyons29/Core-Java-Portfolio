package com.cognixia.jump.corejava.BlackjackProject;

import com.cognixia.jump.corejava.BlackjackProject.Suit.Values;

public class Card {

	//Variable and identifier
	private Suit.Values cardvalue;
	private String suit;
	
	//Printed out suit and value of card
	public String toString() {
		return this.cardvalue.toString() + "-" + this.suit.toString();
	
	}
	//Constructor
	public Card(Values cardvalue, String suit) {
		super();
		this.cardvalue = cardvalue;
		this.suit = suit;
	}

	public Card() {
		super();
	}

	public Suit.Values getCardvalue() {
		return cardvalue;
	}

	public void setCardvalue(Suit.Values cardvalue) {
		this.cardvalue = cardvalue;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	
}
