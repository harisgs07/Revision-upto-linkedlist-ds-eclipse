package rev.Heap_PriorityQueue;

import java.util.PriorityQueue;

public class kthLargestElement {
	
	void theVallueIs(int [] arr, int element) {
		PriorityQueue<Integer> LargestElement = new PriorityQueue<>();
		for (int i = 0; i < element; i++) {
			LargestElement.offer(arr[i]);
		}
		for (int i = element; i < arr.length; i++) {
			if(LargestElement.peek()< arr[i]) {
				LargestElement.poll();
				LargestElement.offer(arr[i]);
			}
		}
		System.out.println(LargestElement.peek());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthLargestElement obj = new kthLargestElement();
		int [] arr = {2,4,1,6,9,4,8,3};
		int element = 3;
		obj.theVallueIs(arr, element);
	}

}
