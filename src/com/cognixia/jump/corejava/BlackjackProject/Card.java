package com.cognixia.jump.corejava.BlackjackProject;

import com.sun.jdi.Value;

public class Card {

	//Variable and identifier
	private String cardSuit;
	private Value cardValue;
	
	//Constructor
	public Card(Value cardvalue, String cardSuit) {
		this.cardValue = cardvalue;
		this.cardSuit = cardSuit;
	}
//Printed out suit and value of card
	public String toString() {
		return this.cardValue.toString() + "-" + this.cardSuit.toString(); 
	}
		
	public Card() {
		super();

	
	}
	public String getCardSuit() {
		return cardSuit;
	}
	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}
	public Value getCardValue() {
		return cardValue;
	}
	public void setCardValue(Value cardValue) {
		this.cardValue = cardValue;
	}
	
	
}
