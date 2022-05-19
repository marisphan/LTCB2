package Ex2_4;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase {
	Coffee a = new Coffee(" Catimor", 34.0, 132.0);
	Coffee b = new Coffee("Cherry", 22.2, 360.0);
	Coffee c = new Coffee("Moka", 61.4, 407.0);

	public void testCost() {
		assertEquals(a.cost(), 4488.0, 0.001);
		assertEquals(b.cost(), 7992.0, 0.001);
		assertEquals(c.cost(), 24989.8, 0.001);
	}

	public void testDiscount() {
		assertEquals(a.discount(), 4488.0, 0.001);
		assertEquals(b.discount(), 799.2, 0.001);
		assertEquals(c.discount(), 6247.45);
	}

}
