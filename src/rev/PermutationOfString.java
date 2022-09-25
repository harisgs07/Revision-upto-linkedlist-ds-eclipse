package rev;

public class PermutationOfString{
	String val;
	PermutationOfString (String val) {
		this.val = val;
	}
	void findPermute() {
		for(int i=0; i < Math.pow(2,val.length());i++) {
			if(i==0)
				System.out.print("' ' ");
			else {
				for(int j = 0; j< val.length();j++) {
					if(((i & (1<<j))>>j)==1) {
						System.out.print(val.charAt(j));
					}
				}
				System.out.print(" ");
			}		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationOfString obj = new PermutationOfString("abc");
		obj.findPermute();
	}

}
