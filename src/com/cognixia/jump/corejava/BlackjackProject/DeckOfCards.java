package com.cognixia.jump.corejava.BlackjackProject;

import java.util.ArrayList;

public class DeckOfCards {

	private ArrayList<Card> cards;

	// Constructor
	public DeckOfCards() {
		this.cards = new ArrayList<Card>();
		
	}
	
	public void generateFullDeck() {
			for(Suit cardSuit : Suit.values()) {
				for(Value cardValue : Value.values()) {
					this.cards.add(new Card(cardSuit,cardValue));
	}
		String[deck] = deck[i];

	public void removeCard(int i) {
		this.cards.remove(i);
	}

	public void shuffle() {
		this.cards.shuffle(i);

		for (int i = 0; i < deck.length; i++) {
			deck[i] = rank[i % 13] + suits[i / 13];
		}

		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);

			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;

		}

		for (String u : deck) {
			System.out.println(deck[u]);
		}

	}
}
