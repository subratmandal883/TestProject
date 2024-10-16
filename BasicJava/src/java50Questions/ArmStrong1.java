package java50Questions;

public class ArmStrong1 {

	public static void main(String[] args) {
		int n=153;
		int comp=n;
		int arm = 0;
		int r;
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
			
		}
		if(comp==arm) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}

	}

}
