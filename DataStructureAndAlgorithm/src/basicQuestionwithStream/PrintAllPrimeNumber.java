package basicQuestionwithStream;
import java.util.stream.IntStream;

public class PrintAllPrimeNumber {

	public static boolean prime(int n) {
		if (n <= 1) {
			return false;
		}
		return IntStream.rangeClosed(2, n-1).allMatch(i -> n % i != 0);
	//	return IntStream.rangeClosed(2, (int) Math.sqrt(n)) 
     //           .allMatch(i -> n % i != 0);
	}

	public static void main(String[] args) {
		int n = 100;
		IntStream.rangeClosed(2, n)
			.filter(PrintAllPrimeNumber::prime)
			.forEach(e -> System.out.print(e + " "));

	}

}
