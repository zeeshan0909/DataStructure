package basicQuestion;

class Fibonacci{
	public void FibonacciSerice(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3; 
		System.out.print(n1 + " " + n2 +" ");
		for(int i=2; i<n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
}
public class FibonacciSequence {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		int n = 20;
		fibonacci.FibonacciSerice(n);
		
	}

}
