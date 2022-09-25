package rev;

public class gcd {	
	int findGcd(int num1,int num2) {
		if(num1%num2 == 0) {
			return num2;
		}
		return findGcd(num2,num1%num2); 
	}
	
	public static void main(String[] args) {
		gcd obj = new gcd();
		System.out.println(obj.findGcd(1420,160));
	}
}
