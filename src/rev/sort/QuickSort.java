package rev.sort;

public class QuickSort {
	static int pivotElement(int [] arr,int low, int high) {
		int temppivot = arr[high];
		int i=low-1;
		for(int j = low; j<high;j++) {
			if(arr[j] <= temppivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp1 = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp1;
		return i+1;
	}
	static void quickSort(int [] arr, int low, int high) {
		if(low<high) {
			int pivot = pivotElement(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	static void print(int [] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arr = {1,3,5,2,6,4};
		quickSort(arr, 0, arr.length-1);
		print(arr);
		
	}
}
