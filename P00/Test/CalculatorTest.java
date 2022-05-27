import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		int a = 200;
		int b = 100;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 300;
		assertEquals (expected, actual);
		}
	
	
	@Test
	public void testSubtract() {
		int a = 200;
		int b = 100;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 100;
		assertEquals (expected, actual);
		}
	
	
	@Test
	public void testMultiply() {
		int a = 200;
		int b = 100;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 20000;
		assertEquals (expected, actual);
		}
	
	
	@Test
	public void testDivide() {
		int a = 200;
		int b = 100;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 2;
		assertEquals (expected, actual);
		}

}
