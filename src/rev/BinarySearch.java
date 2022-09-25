package rev;

public class BinarySearch {
	static void Search(int[] arr,int low, int high, int element) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == element) {
				System.err.println("found");
				break;
			}
			else if(arr[mid]>element)
				high = mid - 1;
			else
				low = mid+ 1;
		}
		if(low>high)
			System.out.println("Not Found");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,6,7,8,9};
		int element = 40;
		Search(arr, 0,arr.length-1,element);
	}
}