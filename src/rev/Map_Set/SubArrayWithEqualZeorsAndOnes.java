package rev.Map_Set;

import java.util.HashMap;

public class SubArrayWithEqualZeorsAndOnes {
	 static void subArrayZeros(int [] arr) {
		 HashMap<Integer, Integer> sum = new HashMap<>();
		 
		 // change 0 to -1 so that equal -1 and 1 results in 0
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				arr[i] = -1;
		}
		 
		int currentsum = 0;
		int start = 0 ;
		int end = 0;
		
		 for (int i = 0; i < arr.length; i++) {
			 currentsum += arr[i];
			sum.putIfAbsent(currentsum, i);
			if(sum.containsKey(currentsum)) {
				if((end-start) < (i-sum.get(currentsum)+1)) {
					start = sum.get(currentsum)+1;
					end = i;
				}
			}
		}
		 System.out.println("Start "+ start+" end "+end);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,0,0,1,0,1,1,0};
		subArrayZeros(arr);
	}

}
