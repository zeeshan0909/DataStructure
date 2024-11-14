package basicQuestion;

public class FactorialCalculation {
	public static void main(String[] args) {
		int n = 6;
		FactorialCalculation ff =  new FactorialCalculation();
		int res = ff.factorial(n);
		System.out.println(res);
		
	}
	//fac of 5  = 5*4*3*2*1 = 120
	public int factorial(int n) {
		int ans = 1;
		while(n > 0) {
			ans = ans * (n);
			n= n-1;
		}
		return ans;
	}

}
