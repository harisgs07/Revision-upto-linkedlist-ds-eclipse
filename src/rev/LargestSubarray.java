package rev;

public class LargestSubarray {
	static void findArray(int [] arr) {
		int start = 0;
		int end = 0;
		int result = arr[0];
		int currentsum = 0;
		for(int i = 0;i<arr.length;i++) {
			currentsum += arr[i];
			if(result<currentsum) {
				result = currentsum;
				end = i;
			}
			if(result<arr[i]) {
				result = arr[i];
				currentsum = arr[i];
				start = i;
				end = i;
			}
		}
		System.out.println("Start at "+start + " and End at "+ end+" The sum is "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,-3, -1,6, -4,4,1,-20,10};
		findArray(arr);
	}

}
