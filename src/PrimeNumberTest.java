import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {
	@Test
	public void testImports() {
		assertTrue("JUnit doesn't like you", true);
	}
	
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeNumber.GetPrimes(1));		
	}
}
