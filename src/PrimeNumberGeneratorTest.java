import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberGeneratorTest {
	@Test
	public void testTwo(){
		assertEquals(PrimeNumberTest.list(2), PrimeNumber.getPrimes(2));
	}
}
