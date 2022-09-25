package rev.sort;

public class BubbleSort {
	
	static void swap(int [] arr, int row, int col) {
		arr[row] = arr[row] ^ arr[col];
		arr[col] = arr[row] ^ arr[col];
		arr[row] = arr[row] ^ arr[col];
 	}
	
	static void bubbleSort(int [] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				while(arr[j]>arr[j+1]) {
					swap(arr,j+1,j);
				}
			}
		}
	}
	
	static void print(int [] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,4,7,3,5};
		bubbleSort(arr);
		print(arr);
	}
}
