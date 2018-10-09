/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePokerTest;

import GamePoker.Hand;
import GamePoker.PokerPlayer;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokerPlayerTest {
    
    @Test
    public void test(String n){
        PokerPlayer player = new PokerPlayer(n);//first player
        //TypeofHand handtype = new TypeofHand();
        Hand hand = new Hand();
        //ScoreofEachCard score = new ScoreofEachcard(hand);
        String name = player.getName();
        hand.showHand();
        //stops if Numan is not there
        assertEquals("Numan", name);//checks name with given
        assertEquals(hand.getScore(), 0);//checks name with given
        assertEquals(hand.showHand(), "");//checks name with given
    }
}
