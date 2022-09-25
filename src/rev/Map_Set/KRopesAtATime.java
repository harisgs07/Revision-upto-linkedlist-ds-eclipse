package rev.Map_Set;

import java.util.PriorityQueue;

public class KRopesAtATime{
	int num1;
	int num2;
	int sum;
	int temp;
	PriorityQueue<Integer> ropesConnected = new PriorityQueue<>();
	void findTheValue(int [] arr,int times) {

		for(int i : arr) {
			ropesConnected.offer(i);
		}
		while(ropesConnected.size() >= times) {
			for (int i = 0; i < times; i++) {
				num1 = num1 + ropesConnected.poll();
			}
			ropesConnected.offer(num1);
			temp = num1;
			num1 = 0;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KRopesAtATime obj = new KRopesAtATime();
		int [] arr = {2,6,4,8,1,9,3,5};
		int times = 2;
		obj.findTheValue(arr,times);
		
	}
}
