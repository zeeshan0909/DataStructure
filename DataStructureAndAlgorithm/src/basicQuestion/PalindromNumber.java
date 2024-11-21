package basicQuestion;

public class PalindromNumber {
	public static void main(String[] args) {
		PalindromNumber palindromNumber = new PalindromNumber();
		int n = 2119112;
		System.out.println(palindromNumber.isPalindrom(n));
	}
	
	public boolean isPalindrom(int n) {
		if(n >= 0 && n <= 9) {
			return true;
		}
		
		int tem = n;
		int reminder = 0;
		int reverse = 0;
		
		while(tem > 0) {
			reminder = tem % 10;
			reverse = (reverse * 10) + reminder;
			tem = tem /10;
		}
		
		if(reverse == n) {
			return true;
		}
		
		return false;	
	}
}
