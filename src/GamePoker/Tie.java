package GamePoker;

/**
 * Tie class for Poker
 */
public class Tie {

    public Tie() {
    }

    /**
     * method which finds the higher scorer between two players. Is used
     */
    public PokerPlayer findWinner(PokerPlayer p1, PokerPlayer p2) {
        /**
         * this whole method is only useful when a tie exists so make sure
         * there's a tie first. Otherwise the winner is clear
         */
        if (p1.getHand().getScore().getVal() > p2.getHand().getScore().getVal()) {
            return p1;
        }
        if (p2.getHand().getScore().getVal() > p1.getHand().getScore().getVal()) {
            return p2;
        }
        /**
         * if you've reached this far, a tie between p1 and p2 exists and you
         * need to iterate through hands to determine who has the higher score
         */
        for (int i = 0; i < 5; i++) {
            int p1Value = p1.getHand().getHand().get(i).getRank();
            int p2Value = p2.getHand().getHand().get(i).getRank();
            if (p1Value > p2Value) {
                return p1;
            }
            if (p2Value > p1Value) {
                return p2;
            }
        }
        return p1;
    }
}
