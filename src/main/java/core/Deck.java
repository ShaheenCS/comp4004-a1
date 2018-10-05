package core;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private Card cards[];
	public Deck(){
		this.cards = new Card[52];
		for (int i = 0; i < 52; i++) {
			// creates the card
			Card card = new Card(null, null);
			// adds card to the deck
			this.cards[i] = card; 
		}
	}
}


/* Creating all possible cards... 
for (Suits s : Suits.values()) {
    for (Ranks r : Ranks.values()) {
         Card c = new Card(s,r);
    }  
}
using enum for card class
*/