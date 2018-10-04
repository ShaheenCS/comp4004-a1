package core;

import junit.framework.TestCase;

public class cardTest extends TestCase {
	
	public void testSuit(){
		assertEquals(true, new Card("",""));
	}
	
	public testRank(){
		assertEquals(true, new Card("",""));
	}
	
	public testEquals(){
		assertEquas(true, new Card("","").equals(new Card("","")));
	}
}
