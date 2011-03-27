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
		candidates.remove(new Integer(4));
//		int counter = 1;
//		for (int i : candidates){
//			if(counter == 2){
//				candidates.remove(candidates.get(Integer(i)));
//				counter = 1;
//			}
//			counter++;
//			
//		}
		return candidates;
	}
}
