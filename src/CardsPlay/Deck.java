package CardsPlay;

/**
 * @version 2.1.1
 * Deck interface for Poker.
 */
public interface Deck {

    /**
     * method to initially set up a deck
     * size, etc
     */
    public void initializeDeck();

    //for shuffling
    public void shuffleDeck();

    //return deck size
    public int getDeckSize();
    
    public void getInitializable();

    //return card object
    Card draw();

}
