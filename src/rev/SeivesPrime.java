package rev;

import java.util.Arrays;

public class SeivesPrime {
	static void primeFind(int limit) {
		boolean [] primearray =new boolean[limit+2];
		Arrays.fill(primearray, true);
		for(int i = 2; i < limit; i++) {
			for(int j = i*2; j<limit; j=j+i) {
				primearray[j] = false;
			}
		}
		
		for(int i = 2; i<limit; i++) {
			if(primearray[i])
				System.out.print(i + " ");
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 15;
		primeFind(limit);
	}
}
