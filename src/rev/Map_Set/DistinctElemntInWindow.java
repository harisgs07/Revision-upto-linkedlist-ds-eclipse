package rev.Map_Set;

import java.util.HashMap;

public class DistinctElemntInWindow {
	static HashMap<Integer, Integer> Elementcount = new HashMap<>();
	
	static void distinctElement(int [] arr, int window) {
		for (int i=0;i<window;i++) {
			Elementcount.put(arr[i], Elementcount.getOrDefault(arr[i],0)+1);
		}
		System.out.println(Elementcount.size());
		int removecount = 0;
		for(int i=window;i<arr.length;i++) {
			
			if(Elementcount.get(arr[removecount]) == 1)
				Elementcount.remove(arr[removecount]);
			else
				Elementcount.put(arr[removecount], Elementcount.getOrDefault(arr[removecount],0)-1);
			Elementcount.put(arr[i], Elementcount.getOrDefault(arr[i], 0)+1);
			
			removecount++;
			System.out.println(Elementcount.size());
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,1,3,4,2,3,5,2,5};
		int winndow = 4;
		distinctElement(arr, winndow);
	}
}
