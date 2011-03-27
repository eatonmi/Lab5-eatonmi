import java.util.ArrayList;

public class PrimeNumber {

	public static ArrayList<Integer> getPrimes(int n) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		while (n % 2 == 0) {
			toReturn.add(2);
			n /= 2;
		}
		while (n % 3 == 0){
			toReturn.add(3);
			n /= 3;
		}
		if (toReturn.isEmpty() && n > 1){
			toReturn.add(n);
		}
		return toReturn;
	}
}
