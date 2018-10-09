package GamePoker;

import CardsPlay.Deck;
import CardsPlay.EvaluateDeck;

/**
 * Dealer class for Poker
 */
public class Dealer {

    public Deck theDeck; // for this case, typical 52-card variant
    
    //constructor
    public Dealer() {
        theDeck = new EvaluateDeck(); // init deck for dealer to use
    }

    public void burnCard() {
        theDeck.draw(); // although method returns Card, don't need it
    }

    //method to deal card to given player
    public void dealHand(PokerPlayer p) {
        for (int i = 0; i < 5; i++) { // hand has 5 cards
            p.getHand().addCard(theDeck.draw());
        }
    }

    /**
     * method to redraw cards to a player's hand after discarding
     */
    public void redrawCard(PokerPlayer p, boolean[] ba) {
        int i = 0;
      
        for (boolean b : ba) {
            if (b) { // if true, work on that card
                p.getHand().discardCard(i); // discard that card
                p.getHand().addCard(theDeck.draw()); // then replace with new
            }
            i++;
        }
    }
}
