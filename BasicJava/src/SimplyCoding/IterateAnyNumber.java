package SimplyCoding;

import java.util.Scanner;

public class IterateAnyNumber {

	public static void main(String[] args) {
		int n=213;
	//	int newNumber=n;
		int p = 0;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			 p=p+d;
			n=n/10;
		}
		

	}

}
