import java.util.ArrayList;

public class PrimeNumber {

	public static ArrayList<Integer> getFactors(int n) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		int candidate = 2;
		while(n != 1){
			while(n % candidate == 0){
				toReturn.add(candidate);
				n /= candidate;
			}
			candidate++;
		}
		return toReturn;
	}
	
	public static ArrayList<Integer> getPrimes(int n){
		return new ArrayList<Integer>();
	}
}
