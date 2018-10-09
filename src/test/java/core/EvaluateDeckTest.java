
package CardsPlay;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluateDeckTest {
    @Test
    public void test(){
        EvaluateDeck deck = new EvaluateDeck();//initializes deck
        deck.initializeDeck();
        deck.shuffleDeck();
        int size = deck.getDeckSize();
        assertEquals(52, size);//checks first cards with first choosen
    }
}
