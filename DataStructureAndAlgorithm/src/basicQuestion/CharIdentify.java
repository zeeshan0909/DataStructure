package basicQuestion;

import java.util.Scanner;

public class CharIdentify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("this is lower case");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("this is upper case");
		}else if(ch >= '0' && ch <= '9'){
			System.out.println("this is a number");
		}
		
	}
	
	
}
