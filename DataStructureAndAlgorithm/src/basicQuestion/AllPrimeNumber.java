package basicQuestion;

class Primee {
	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public void printNumber(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

public class AllPrimeNumber {
	public static void main(String[] args) {
		Primee pp = new Primee();
		int n = 50;
		pp.printNumber(n);

	}
}
