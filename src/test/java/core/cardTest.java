package core;

import junit.framework.TestCase;

public class cardTest extends TestCase {
	
	public void testSuit(){
		assertEquals(true, new Card(10,12).isSuit(3));
	}
	
	public void testRank(){
		assertEquals(true, new Card(2,11).isRank(6));
	}
	
	public void testEquals(){
		assertEquals(0, new Card(5,10).Equals(new Card(5,10)));
	}
}
