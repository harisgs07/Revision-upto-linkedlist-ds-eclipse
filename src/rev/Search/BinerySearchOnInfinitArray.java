package rev.Search;

public class BinerySearchOnInfinitArray {
	static int Search(int [] arr,int low,int high,int element) {
		if(low>high)
			return 0;
		int mid=(low+high)/2;
		if(arr[mid]== element)
			return 1;
		else if (arr[mid]>element)
			return Search(arr, low, mid-1, element);
		else
			return Search(arr, mid + 1, high, element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,6,7,8,9};
		int element = 9;
		if(element>arr[arr.length-1])
			System.out.println("Not Found");
		else {
			int i = 1;
			while(element > arr[i]) {
				i = i * 2;
				if(i>arr.length) {
					i = arr.length;
					break;
				}
			}
			if(Search(arr, 0,i,element) == 1)
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
	}
}
