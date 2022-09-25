package rev;

//Main Disadvantage if the array contains negative only then this algorithm wont work!!
public class LargestContiguosSubarrayKadanes {
	static void subArray(int [] arr) {
		int currentsum=0;
		int maxSum = Integer.MIN_VALUE;
		for(int i:arr) {
			currentsum = Math.max(i, currentsum+i);
			maxSum = Math.max(maxSum, currentsum);
		}
		System.out.println(maxSum);
	}
	public static void main(String[] args) {
		int [] arr = {-2,-3,-1,-6, -4,-4,-1,-20,-10};
		subArray(arr);
		
	}
	

}
