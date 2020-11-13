package com.cognixia.jump.corejava.BlackjackProject;

import java.util.ArrayList;

public class Dealer {

	private ArrayList<Card> cards;

	// Constructor
	public Dealer() {
		this.cards = new ArrayList<Card>();

	}

	public void generateFullDeck() {

		for (Suit.Values cardSuit : Suit.Values.values()) {
			for (String cardValue : Suit.suits){
				this.cards.add(new Card(cardSuit, cardValue)}
			
	public void removeCard(int i) {
		this.cards.remove(i);
	}
		
	public void draw(Deck.comingFrom) {
		this.cards.add(comingFrom.getCard(0));
	

	public void shuffle() {
		this.cards.shuffle(i);
		
		}

	}
	
