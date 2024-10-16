package java50Questions;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		int n,c,r,arm = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to find armStrong");
		n=s.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("armStrong");
		}else {
			System.out.println("not ArmStrong");
		}
	}

}
