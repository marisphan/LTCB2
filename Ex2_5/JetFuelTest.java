package Ex2_5;

import junit.framework.TestCase;

public class JetFuelTest extends TestCase {
	JetFuel a = new JetFuel(23450000.0, "A", 4.77);
	JetFuel b = new JetFuel(5760000.0, "A1", 6.25);

	public void testCost() {
		assertEquals(a.cost(), 111856500, 0.001);
		assertEquals(b.cost(), 36000000, 0.001);
	}

	public void testDiscount() {
		assertEquals(a.discount(), 11185650, 0.001);
		assertEquals(b.discount(), 3600000, 0.001);
	}

}
