package Ex2_2;

import junit.framework.TestCase;

public class MovieTest extends TestCase {
	
		Movie a = new Movie(5.0, 20.0 , 0.15);
		Movie b = new Movie(6.0, 40.0, 0.1);
		Movie c = new Movie(7.0, 50.0, 0.2);
	
	public void testCost() {
	assertEquals(a.cost(100), 35.0, 0.001);
	assertEquals(b.cost(120), 52.0, 0.001);
	assertEquals(c.cost(150), 80.0, 0.001);
	}
	public void  testRevenue() {
		assertEquals(a.revenue(100), 500.0, 0.001);
		assertEquals(b.revenue(120), 720.0, 0.001);
		assertEquals(c.revenue(150), 1050.0, 0.001);
	}
public void testTotalProfit() {
	assertEquals(a.totalProfit(100), 465.0, 0.001);
	assertEquals(b.totalProfit(120), 668.0, 0.001);
	assertEquals(c.totalProfit(150), 970.0, 0.001);
}
}