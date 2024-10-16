package digitalOcean50Code;

import java.util.Scanner;

//5. Write a Java program to print a Fibonacci sequence using recursion.
public class FibonacciSequence {

	public static void main(String[] args) {
		int a=0,b=1,c=1;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
				
	}

}
