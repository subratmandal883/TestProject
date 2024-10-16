package JavaBasicDemo;

import java.util.Scanner;

public class fibonacciNumbers {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range to find fibonacci Numbers");
		term =s.nextInt();
		for(int i=0;i<=term;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
