package Ex2_6;

import junit.framework.TestCase;

public class QuadraticTest extends TestCase {
	Quadratic a1 = new Quadratic(0.0, 1.0, 2.0);
	Quadratic b1 = new Quadratic(2.0, 1.0, 2.0);
	Quadratic c1 = new Quadratic(1.0, 2.0, 1.0);
	Quadratic d1 = new Quadratic(2.0, 3.0, 1.0);
	public void testWhatKind() {
		assertEquals(a1.whatKind(), "degenerate");
		assertEquals(b1.whatKind(), "none");
		assertEquals(c1.whatKind(), "one solution");
		assertEquals(d1.whatKind(), "two solution");
	}
}
