package rev.Search;

public class BookAllocation {
	static boolean isPossible(int [] arr, int std,int mid) {
		int sum = 0;
		int stdrequired = 1;
		for (int i : arr) {
			if((sum+i)>=mid) {
				sum = i;
				stdrequired++;
			}
			sum = sum + i;
		}
		return stdrequired<=std;
	}
	
	static void allocate(int [] arr, int low, int high, int std) {
		int start = arr[high];
		int end = 0;
		int mid = 0;
		int res = 0;
		for (int i : arr) {
			end = end + i;
		}
		
		while(start<=end) {
			mid = start+(end-start)/2;
			if(isPossible(arr,std,mid)) {
				res = mid;
				end = mid-1;
			}
			else
				start = mid+1;
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,40,35};
		allocate(arr, 0, arr.length-1, 2);
		
	}
}
