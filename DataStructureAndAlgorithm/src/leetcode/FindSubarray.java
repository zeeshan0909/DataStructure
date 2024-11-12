package leetcode;

import java.util.ArrayList;
import java.util.List;

class Subarray{
	public  List<List<Integer>> subArraySum(int[] nums, int k) {
		List<List<Integer>> subarray = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			List<Integer> currentSubArray = new ArrayList<Integer>();
			for(int j=i; j<nums.length; j++) {
				currentSubArray.add(nums[j]);
				subarray.add(new ArrayList<Integer>(currentSubArray));
			}
		}
		
		return subarray;
	}
}
public class FindSubarray {

	public static void main(String[] args) {
		int k = 3;
		int [] arr = {1,2,3,4};
		Subarray subarraysum = new Subarray();
		List<List<Integer>> ll = subarraysum.subArraySum(arr, k);
		for(List<Integer> ss : ll) {
			System.out.println(ss);
		}
	}

}
