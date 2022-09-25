package rev.Search;

public class BinarySearchRecursion {
	static int Search(int[] arr,int low, int high, int element) {
		if(low> high)
			return 0;
		int mid = (low+high)/2;
		if(arr[mid] == element)
			return 1;
		else if(arr[mid]>element)
			return Search(arr, low, mid-1, element);
		else
			return Search(arr, mid+1, high, element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,6,7,8,9};
		int element = 4;
		if(Search(arr, 0,arr.length-1,element) == 1)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}