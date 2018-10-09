package GamePoker;

/**
 * HandType is determined by value of enumeration for Poker
 */
public enum TypeofHand {
    ROYAL_FLUSH(10),
    STRAIGHT_FLUSH(9),
    FOUR_OF_A_KIND(8),
    FULL_HOUSE(7),
    FLUSH(6),
    STRAIGHT(5),
    THREE_OF_A_KIND(4),
    TWO_PAIR(3),
    PAIR(2),
    HIGH_CARD(1);

    private final int value;

    private TypeofHand(final int v) {
        value = v;
    }

    public int getVal() {
        return value;
    }
}
