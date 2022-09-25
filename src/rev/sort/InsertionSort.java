package rev.sort;

public class InsertionSort {
	static void insSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while((j>=0)&&(arr[j]>temp)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	static void print(int [] arr) {
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arr = {1,3,5,2,6,4};
		insSort(arr);
		print(arr);
	}

}
