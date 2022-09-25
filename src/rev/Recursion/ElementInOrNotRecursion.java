package rev.Recursion;

public class ElementInOrNotRecursion {
	static boolean presentOrNot(int[] arr,int pos,int element) {
		if(pos == arr.length) 
			return false;
		return ((arr[pos] == element) || presentOrNot(arr, pos+1, element));
	}
	public static void main(String[] args) {
		int[] arr =  {2,4,5,3};
		System.out.println(presentOrNot(arr,0,1));
	}
}
