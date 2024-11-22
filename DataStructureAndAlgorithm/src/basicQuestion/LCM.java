package basicQuestion;

public class LCM {
	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		LCM lcm = new LCM();
		int ans = lcm.findLCM(a, b);
		System.out.println(ans);
	}

	public static int findLCM(int a, int b) {
		int greater = Math.max(a, b);
		int smallest = Math.min(a, b);
		for (int i = greater;; i += greater) {
			if (i % smallest == 0)
				return i;
		}
	}
}
