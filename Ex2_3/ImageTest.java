package Ex2_3;

import junit.framework.TestCase;

public class ImageTest extends TestCase {
	Image a = new Image(56, 112, "LG", "medium");
	Image b = new Image(1600, 1200, "LCD", "good");
	Image c = new Image(650, 720, "Vsmart", "medium");

	public void testIsPortrait() {
		assertTrue(a.isPortrait());
		assertFalse(b.isPortrait());
		assertTrue(c.isPortrait());
	}

	public void testSize() {
		assertEquals(a.size(), 6272);
		assertEquals(b.size(), 1920000);
		assertEquals(c.size(), 468000);
	}

	public void testIsLarge() {
		assertTrue(b.isLarge(a));
		assertFalse(a.isLarge(b));
		assertTrue(c.isLarge(a));
	}

	public void testSame() {
		assertTrue(a.same(new Image(56, 112, "LG", "medium")));
		assertFalse(b.same(c));
		assertTrue(c.same(new Image(650, 720, "Vsmart", "medium")));

	}

	public void testSizeString() {
		assertEquals(a.sizeString(), "small");
		assertEquals(b.sizeString(), "large");
		assertEquals(c.sizeString(), "medium");
	}
}
