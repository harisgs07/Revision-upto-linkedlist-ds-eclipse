package rev;

public class TrappingRainWater {
	static void trappedAmount(int [] arr) {
		
		int [] arrLeft = new int [arr.length] ;
		arrLeft[0] = arr[0];
		int [] arrRight = new int [arr.length];
		arrRight[arr.length-1] = arr[arr.length -1];
		int res=0;
		
		//max value from left of array!! to new array
		for (int i = 1; i < arr.length; i++) {
			arrLeft[i] = Math.max(arr[i], arrLeft[i-1]);
		}
		
		//Max from right side of the array
		for (int i = arr.length-2; i >= 0; i--) {
			arrRight[i] =  Math.max(arr[i], arrRight[i+1]);
		}
		
		for(int i = 0; i<arr.length;i++)
			res = res + ((Math.min(arrLeft[i], arrRight[i])-arr[i]));
		System.out.println(res);
	}
	public static void main(String[] args) {
		int [] arr = {7,1,2,5,1,2,3,4};
		trappedAmount(arr);
		
	}
}
