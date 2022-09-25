package rev.Search;

public class BinarySearchRotatedArray {
	static int Search(int[] arr,int low, int high, int element) {
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid]==element)
			return 1;	
		if(arr[low]<= arr[mid]) {
			if((element >= arr[low]) && (element<= arr[mid]))
				return Search(arr,low,mid-1,element);
			return Search(arr, mid+1, high, element);
		}
		if((element >= arr[mid]) && (element<= arr[high]))
			return Search(arr,mid+1,high,element);
		return Search(arr, low, mid-1, element);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,9,2,5,6,7};
		int element = 19;
		int a = Search(arr, 0,arr.length-1,element);
		if(a==1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
