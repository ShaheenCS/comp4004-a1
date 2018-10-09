package GamePoker;

import CardsPlay.Card;
import static GamePoker.TypeofHand.*;

/**
 * Score class for Poker
 */
public class ScoreofEachCard {

    // 'histograms' of frequencies for ranks and suits
    private final int[] rankFreq = new int[13];
    private final int[] suitFreq = new int[4];
    private final Hand playerHand; // the player's hand
    private final TypeofHand theScore; // the player's score

    /**
     * constructor for Score class, determines frequency of suits and ranks and
     * tabulates a hand's score based on those frequencies
     *
     * @param h - the hand which score is calculated against
     */
    ScoreofEachCard(Hand h) {
        playerHand = h;
        // populate histogram
        for (Card c : playerHand.getHand()) {
            rankFreq[c.getRank()]++;
            suitFreq[c.getSuit()]++;
        }
        theScore = tabScore(); // tabulate scores
    }

    /**
     * method to get the score of a hand
     *
     * @return the score
     */
    protected TypeofHand getScore() {
        return theScore;
    }

    /**
     * gathers score by checking each possible hand
     *
     * @return score of hand; tiebreaker determined in other class
     */
    private TypeofHand tabScore() {
        /**
         * this is a boilerplate method to find score of a hand and determine a
         * winner in non-tiebreaking instances
         */
        
        if (checkRoyalFlush()) {
            return ROYAL_FLUSH;
        } // Royal Flush
        if (checkStraightFlush()) {
            return STRAIGHT_FLUSH;
        } // Straight Flush
        if (checkMult(4)) {
            return FOUR_OF_A_KIND;
        } // Four of a Kind
        if (checkFullHouse()) {
            return FULL_HOUSE;
        } // Full House
        if (checkFlush()) {
            return FLUSH;
        } // Flush
        if (checkStraight()) {
            return STRAIGHT;
        } // Straight
        if (checkMult(3)) {
            return THREE_OF_A_KIND;
        } // Three of a Kind
        if (checkTwoPair()) {
            return TWO_PAIR;
        } // Two Pairs
        if (checkMult(2)) {
            return PAIR;
        } // One Pair
        return HIGH_CARD; // High Card
    }

    private boolean checkFlush() {
        for (int i : suitFreq) {
            if (i == 5) { // if all suits the same
                return true;
            }
        } // otherwise impossible to be a flush
        return false;
    }

    private boolean checkRoyalFlush() {
        // a royal flush is both a flush and straight
        if (checkFlush() && checkStraight()) {
            // and contains ace as top card
            if (playerHand.topRank().getRank() == 13) {
                return true;
            }
        } // otherwise impossible to be a RF
        return false;
    }

    private boolean checkStraightFlush() {
        /**
         * note a straight-flush is both a straight and a flush but without a
         * check for high-ace (otherwise RF) which is checked before this is
         * checked
         */
        return checkFlush() && checkStraight();
    }

    private boolean checkStraight() {
        int count = 0; // to count the number of successive ranks
        for (int i = 0; i < rankFreq.length - 1; i++) {
            if (rankFreq[i] == rankFreq[i + 1]) {
                // this count will only be five if straight
                count++;
            } else {
                return false;
            }
        }
        return count == 5;
    }

    private boolean checkMult(int i) {
        for (int j : rankFreq) {
            /**
             * if the hand contains any n of the same rank then the hand
             * contains an n-of-a-kind
             */
            if (j == i) {
                return true;
            }
        } // otherwise nope
        return false;
    }

    private boolean checkFullHouse() {
        // recall a FH is a 3OAK and 2OAK
        return checkMult(3) && checkMult(2);
    }

    private boolean checkTwoPair() {
        int count = 0; // for counting pairs
        for (int i : rankFreq) {
            if (i == 2) {
                count++;
            }
        }
        return count == 2;
    }
}
