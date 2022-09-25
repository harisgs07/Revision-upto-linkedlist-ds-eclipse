package rev;

public class JosephsProblem {
	public static void main(String[] args) {
		int members = 7;
		int interval = 3;
		int sum = 0;
		for(int i=2;i<= members;i++)
			sum = (sum+interval)%i;
		System.out.println(sum +1);
	}
}
