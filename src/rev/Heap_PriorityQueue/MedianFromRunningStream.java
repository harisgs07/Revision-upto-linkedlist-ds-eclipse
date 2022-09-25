package rev.Heap_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromRunningStream {
	PriorityQueue<Double> leftheap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Double> rightheap = new PriorityQueue<>();
	void arrangeElement(double element) {
		if(leftheap.size()==0|| leftheap.peek() > element)
			leftheap.offer(element);
		if(leftheap.peek()<element)
			rightheap.offer(element);
		
		if(leftheap.size()>rightheap.size()+1)
			rightheap.offer(leftheap.poll());
		if(rightheap.size()>leftheap.size())
			leftheap.offer(rightheap.poll());
	}
	
	double findMedian() {
		if(leftheap.size() == rightheap.size())
			return (leftheap.peek()+rightheap.peek())/2;
		return leftheap.peek();
	}
	
	public static void main(String[] args) {
		MedianFromRunningStream obj = new MedianFromRunningStream();
		obj.arrangeElement(2);
		obj.arrangeElement(5);
		obj.arrangeElement(4);
		obj.arrangeElement(9);
		obj.arrangeElement(7);
		obj.arrangeElement(20);
		obj.arrangeElement(3);
		obj.arrangeElement(11);
		obj.arrangeElement(10);
		obj.arrangeElement(6);
		System.out.println(obj.findMedian());
	}
}
