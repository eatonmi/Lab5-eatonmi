import java.util.ArrayList;

public class PrimeNumber {

	public static ArrayList<Integer> getPrimes(int n) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		if (n == 2) {
			toReturn.add(2);
		}
		if(n == 3){
			toReturn.add(3);
		}
		return toReturn;
	}
}
