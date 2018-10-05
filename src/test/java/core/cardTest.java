package core;

import junit.framework.TestCase;

public class cardTest extends TestCase {
	
	public void testSuit(){
		assertEquals(true, new Card(10,12).isSuit(3));
	}
	public void testSuit1(){
		assertEquals(false, new Card(10,12).isSuit(9));
	}
	
	public void testSuit2(){
		assertEquals(false, new Card(0,0).isSuit(0));
	}
	
	public void testRank(){
		assertEquals(true, new Card(2,11).isRank(6));
	}
	
	public void testRank1(){
		assertEquals(false, new Card(2,11).isRank(16));
	}
	
	public void testRank2(){
		assertEquals(false, new Card(0,0).isRank(0));
	}
	
	public void testEquals(){
		assertEquals(0, new Card(5,10).Equals(new Card(5,10)));
	}
	
	public void testEquals1(){
		assertEquals(1, new Card(5,10).Equals(new Card(10,5)));
	}
}


