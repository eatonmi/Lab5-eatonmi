import java.util.ArrayList;

public class PrimeNumber {

	public static ArrayList<Integer> getPrimes(int n) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		if (n > 1) {
			toReturn.add(2);
		}
		return toReturn;
	}
}
