package leetcode;

class Producte {
	public int[] productExceptSelf(int[] nums) {
		
		int arr[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int prod = 1;
			for (int j = 0; j < nums.length; j++) {
				if(j != i) {
					prod = prod * nums[j];
				}
			}
			arr[i] = prod;
		}
		return arr;
	}
}

public class ProductofArrayExceptSelf {
	public static void main(String[] args) {
		Producte producte = new Producte();
		int arr[] = {1,2,3,4};
		System.out.println(producte.productExceptSelf(arr));
	}
}
