package rev;

public class FindValuePowerdNumber {
	static void findPower(int num,int pow) {
		int res=1;
		while(true) {
			if((pow & 1)==0) {
				res = res * (num * num);
				pow = pow >> 1;
				if(pow==1)
					break;
			}
			else {
				res = res * num;
				pow -=1;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		int num = 3;
		int pow = 5;
		findPower(num, pow);
	}
}
