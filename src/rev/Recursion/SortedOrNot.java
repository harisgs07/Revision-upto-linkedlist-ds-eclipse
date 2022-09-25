package rev.Recursion;

public class SortedOrNot {
	static boolean check(int [] arr,int pos) {
		if(pos == arr.length)
			return true;
		return ((arr[pos] > arr[pos-1]) && check(arr,pos+1));
	}
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,7};
		System.out.println(check(arr,1));
	}
}
