package leetcode;

class Solution {
	public int maxSubArray(int[] nums) {
		
		int sum = 0;
	    int maxSum = nums[0];
		
	    for (int i = 0; i < nums.length; i++) {
	        sum += nums[i];
	        
	        maxSum = Math.max(maxSum, sum);
			
			if (sum < 0) {
				sum = 0;
			}
		}
		
		return maxSum;
	}
}

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
		Solution solu = new Solution();
		int ans = solu.maxSubArray(nums);
		System.out.println(ans);
		
	}

}
