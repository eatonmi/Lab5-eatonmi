import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberGeneratorTest {
	@Test
	public void testTwo(){
		assertEquals(PrimeNumberTest.list(), PrimeNumber.getPrimes(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(PrimeNumberTest.list(2), PrimeNumber.getPrimes(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(PrimeNumberTest.list(2,3), PrimeNumber.getPrimes(4));
	}
	
	@Test
	public void testSix(){
		assertEquals(PrimeNumberTest.list(2,3,5), PrimeNumber.getPrimes(6));
	}
}
