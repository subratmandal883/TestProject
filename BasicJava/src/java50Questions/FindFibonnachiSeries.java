package java50Questions;

import java.util.Scanner;

public class FindFibonnachiSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int term=s.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<term;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;

		}
		
	}

}
