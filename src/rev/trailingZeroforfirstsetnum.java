package rev;

public class trailingZeroforfirstsetnum {
	static void findTrailingZero(int num) {
		int res = 0;
		for(int i = 5;i<num;i=i*5)
			res = res+(num/i);
		System.out.println(res);
	}
	public static void main(String[] args) {
		findTrailingZero(10);
	}
}
