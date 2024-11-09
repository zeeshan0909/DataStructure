package basicQuestion;

class Prime{
	
	public boolean isPrime(int n) {
		if(n <=1)
			return false;
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
public class PrimeNumber {
	public static void main(String[] args) {
		Prime p = new Prime();
		boolean ans =  p.isPrime(10);
		System.out.println(ans);
		System.out.println(p.isPrime(7));
	}
}
