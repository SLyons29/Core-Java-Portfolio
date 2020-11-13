package com.cognixia.jump.corejava.BlackjackProject;

public class Suit {

	public static final String[] suits = { "Club", "Diamond", "Spade", "Heart" };

	public enum Values {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10),
		ACE(11);

		private int cardvalue;

		private Values(int value) {
			this.cardvalue = value;
		}

		public int getCardvalue() {
			return cardvalue;
		}

	}
}