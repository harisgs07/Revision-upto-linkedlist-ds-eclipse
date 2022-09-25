package rev.Map_Set;

import java.util.HashMap;

public class SubArraywithGivenSum {
	static boolean subArray(int [] arr, int sum) {
		HashMap<Integer,Integer> sumIndex = new HashMap<>();
		int start=0;
		int end = 0;
		int currentSum=arr[0];
		sumIndex.putIfAbsent(currentSum, 0);
		for (int i = 1; i < arr.length; i++) {
			currentSum += arr[i];
			sumIndex.putIfAbsent(currentSum, i);
			if(sumIndex.containsKey(currentSum-sum)) {
				start = sumIndex.get(currentSum-sum) + 1;
				end = i;
				System.out.println("Start at "+start+ " Ends at " + end + " Sum of subarray is "+ sum);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int [] arr = {-2,2,-3};
		if(!subArray(arr, 2))
			System.out.println("No such Summed sub array present in give array ");
	}
}
