import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberGeneratorTest {
	@Test
	public void testTwo() {
		assertEquals(PrimeNumberTest.list(), PrimeNumber.getPrimes(2));
	}

	@Test
	public void testThree() {
		assertEquals(PrimeNumberTest.list(2), PrimeNumber.getPrimes(3));
	}

	@Test
	public void testFour() {
		assertEquals(PrimeNumberTest.list(2, 3), PrimeNumber.getPrimes(4));
	}

	@Test
	public void testSix() {
		assertEquals(PrimeNumberTest.list(2, 3, 5), PrimeNumber.getPrimes(6));
	}

	@Test
	public void testSeven() {
		assertEquals(PrimeNumberTest.list(2, 3, 5), PrimeNumber.getPrimes(7));
	}

	@Test
	public void testEight() {
		assertEquals(PrimeNumberTest.list(2, 3, 5, 7), PrimeNumber.getPrimes(8));
	}

	@Test
	public void testTwelve() {
		assertEquals(PrimeNumberTest.list(2, 3, 5, 7, 11),
				PrimeNumber.getPrimes(12));
	}

	@Test
	public void testBig() {
		assertEquals(PrimeNumberTest.list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29),
				PrimeNumber.getPrimes(30));
	}

}
