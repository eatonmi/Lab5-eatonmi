import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumberTest {
	@Test
	public void testImports() {
		assertTrue("JUnit doesn't like you", true);
	}
	
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeNumber.getPrimes(1));		
	}
	
	public void testTwo(){
		assertEquals(new ArrayList<Integer>(new Integer(2)), PrimeNumber.getPrimes(2));
	}
}
