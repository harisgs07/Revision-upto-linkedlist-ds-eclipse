package rev.Heap_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthMinumElementInAnArray {
	void theValue(int[]arr, int element) {
		PriorityQueue<Integer> givenMinimum = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < element; i++) {
			givenMinimum.offer(arr[i]);
		}
		for (int i =element; i < arr.length; i++) {
			if(givenMinimum.peek()>arr[i]) {
				givenMinimum.poll();
				givenMinimum.offer(arr[i]);
			}
		}
		System.out.println(givenMinimum.peek());
	}
	public static void main(String[] args) {
		kthMinumElementInAnArray obj = new kthMinumElementInAnArray();
		int [] arr = {2,4,1,6,9,4,8,3,0};
		int element = 3;
		obj.theValue(arr, element);
	}
}
