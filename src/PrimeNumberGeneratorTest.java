import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberGeneratorTest {
	@Test
	public void testTwo(){
		assertEquals(PrimeNumberTest.list(), PrimeNumber.getPrimes(2));
	}
	
	public void testThree(){
		assertEquals(PrimeNumberTest.list(2), PrimeNumber.getPrimes(3));
	}
}
