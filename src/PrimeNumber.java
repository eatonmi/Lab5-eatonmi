import java.util.ArrayList;

public class PrimeNumber {

	public static ArrayList<Integer> getFactors(int n) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		int candidate = 2;
		while (n != 1) {
			while (n % candidate == 0) {
				toReturn.add(candidate);
				n /= candidate;
			}
			candidate++;
		}
		return toReturn;
	}

	public static ArrayList<Integer> getPrimes(int n) {
		if (n < 3) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> candidates = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			candidates.add(i);
		}
		int p = 2;
		for (int i = 2; i * p < n; i++) {
			candidates.remove(new Integer(i * p));
		}
		p = 3;
		for (int i = 2; i * p < n; i++) {
			candidates.remove(new Integer(i * p));
		}
		return candidates;
	}
}
