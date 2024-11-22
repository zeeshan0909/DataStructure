package basicQuestion;

public class GCM {
	public static void main(String[] args) {
		GCM gcm = new GCM();
		int a = 20;
		int b = 28;
		int ans = gcm.findGcm(a, b);
		System.out.println(ans);
	}
	
	public int findGcm(int a, int b) {
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		
		if(a == b) {
			return a;
		}
		
		int res = Math.max(a, b);
		while(res > 0) {
			if(a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}
}
