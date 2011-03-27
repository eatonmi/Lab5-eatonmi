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
		assertEquals(list(), PrimeNumber.getFactors(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeNumber.getFactors(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(3), PrimeNumber.getFactors(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeNumber.getFactors(4));
	}

	@Test
	public void testSix() {
		assertEquals(list(2, 3), PrimeNumber.getFactors(6));
	}

	@Test
	public void testSeven() {
		assertEquals(list(7), PrimeNumber.getFactors(7));
	}

	@Test
	public void testEight() {
		assertEquals(list(2, 2, 2), PrimeNumber.getFactors(8));
	}

	@Test
	public void testBig() {
		assertEquals(list(5, 7, 7, 1327), PrimeNumber.getFactors(325115));
	}
	
	@Test
	public void testNine(){
		assertEquals(list(3,3), PrimeNumber.getFactors(9));
	}

	public static ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		for (int i : ints) {
			toReturn.add(i);
		}
		return toReturn;
	}
}
