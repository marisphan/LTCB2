package Ex2_1;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
		Employee a1 = new Employee("Mai", 30);
		Employee a2 = new Employee("Minh", 102);
		Employee a3 = new Employee("Nam", 20);
	public void testWage() {
		
		assertEquals(a1.wage(), 360);
		assertEquals(a2.wage(), 1224);
		assertEquals(a3.wage(), 240);
		}
	public void testTax() {
		
		assertEquals(a1.tax(), 54.0, 0.001);
		assertEquals(a2.tax(), 183.6, 0.001);
		assertEquals(a3.tax(), 36.0, 0.001);
		}
	public void testNetpay() {
		
		assertEquals(a1.netpay(), 306.0, 0.01);
		assertEquals(a2.netpay(), 1040.4, 0.01);
		assertEquals(a3.netpay(), 204.0, 0.001);
		}
	public void testRaisedWage() {
		
		assertEquals(a1.raisedWage(), 374.0, 0.001);
		assertEquals(a2.raisedWage(), 1238.0, 0.001);
		assertEquals(a3.raisedWage(), 254, 0.001);
		}
	public void testCheckOverTime() {
	
		assertFalse(a1.checkOverTime());
		assertTrue(a2.checkOverTime());
		assertFalse(a3.checkOverTime()); 
		}
	
}