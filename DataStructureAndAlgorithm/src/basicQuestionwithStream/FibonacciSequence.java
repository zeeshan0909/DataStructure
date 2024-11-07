package basicQuestionwithStream;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stream.iterate(new int[] {0, 1} , 
				t -> new int[] {t[1], t[0] + t[1]})
		.limit(n)
		.map(x -> x[0])
		.forEach(System.out::println);
	}

}
