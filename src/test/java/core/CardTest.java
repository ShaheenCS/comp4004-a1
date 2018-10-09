package CardsPlay;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    @Test
    public void test(){
        Card card = new Card(1);//first card
        String value = card.getCard();
        int value1 = Integer.valueOf(value);
        int rank = card.getRank();
        int suit = card.getSuit();
        int output = rank + suit;
        assertEquals(value1, output);//checks first cards with first choosen
    }
}
