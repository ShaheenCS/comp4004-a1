package CardsPlay;

/**
 * @version 2.1.1
 */
public class Card {

    private static final String[] SUITS = {"\u2660", "\u2665", "\u2666", "\u2663"};//ASCII codes for heart spades diamond clubs
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
         "J", "Q", "K", "A"};
    private final int cardNum; // the number of a card (1-52)

    /**
     * constructor for card class
     * @param c - card number (1-52 for standard 52-deck) initialize to
     */
    public Card(int c) {
        cardNum = c;
    }


    
    public int getRank() {
        return cardNum % 13; // assuming 52-card deck, 13 of each suit
    }

    public int getSuit() {
        return cardNum % 4; // assuming 52-card deck, 4 of each rank
    }

    public String getCard() {
        return RANKS[getRank()] + SUITS[getSuit()];
    }
}
