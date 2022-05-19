package Ex2_7;

import junit.framework.TestCase;

public class TransactionTest extends TestCase {
	Transaction a = new Transaction("Thuy", 6000, 2);
	Transaction b = new Transaction("Mai", 2500, 1);
	Transaction c = new Transaction("Nam", 1500, 2);
	Transaction d = new Transaction("Tien", 500, 2);
	public void testInterest() {
		assertEquals(300.0, a.interest(), 0.001);
		assertEquals(112.5, b.interest(), 0.001);
		assertEquals(67.5, c.interest(), 0.001);
		assertEquals(20.0, d.interest(), 0.001);
	}
	public void testPayback() {
		assertEquals(48.75, a.payback(), 0.001);
		assertEquals(13.75, b.payback(), 0.001);
		assertEquals(6.25, c.payback(), 0.001);
		assertEquals(1.25, d.payback(), 0.001);
	}
}
