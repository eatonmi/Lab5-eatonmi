import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumberTest {
	@Test
	public void testImports() {
		assertTrue("JUnit doesn't like you", true);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumber.getPrimes(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeNumber.getPrimes(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(3), PrimeNumber.getPrimes(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeNumber.getPrimes(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2,3), PrimeNumber.getPrimes(6));
	}

	public ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		for (int i : ints) {
			toReturn.add(i);
		}
		return toReturn;
	}
}
