package rev;

public class SingleUnique {
public static void main(String[] args) {
	int[] arr = {1,2,1,2,4};
	int sum =0 ;
	for (int i : arr) {
		sum = sum ^ i;
	}
	System.out.println(sum);
}
}
