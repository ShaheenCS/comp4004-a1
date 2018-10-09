package GamePoker;

/**
 * @version 2.1.0
 * PokerPlayer class for Poker
 */
public final class PokerPlayer implements Player {

    private final String name; // name of player
    private final Hand playerHand; // the hand a player owns
    private final int money; // how much money they possess
    private final String card; // which card they possess

    // constructor for Player class
     
    public PokerPlayer(String n) {
        name = n;
        money = 500; // let's say initial money is $500
        playerHand = new Hand(); // set up empty hand for player
        card = "";//no card
        }

    /**
     * method to get the hand a player has
     * @return the player's hand
     */
    public Hand getHand() {
        return playerHand;
    }

    /**
     * method to get the name of the player
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * method to get the card of the player
     * @return the card of the player
     */
    @Override
    public String getCard() {
        return card;
    }

}
