package rev;

public class TwiceRepeatingwithTwoUnique {
public static void main(String[] args) {
	int[] arr = {1,2,2,1,4,3,6,3};
	int sum = 0;
	for (int i : arr) {
		sum = sum ^ i;
	}
	int negation = sum & (-sum);
	int first = 0;
	int second = 0;
	for(int i: arr) {
		if((i & negation)> 0)
			first = first ^ i;
		else
			second = second ^ i;		
	}
	System.out.println(first + " " + second);
}
}
