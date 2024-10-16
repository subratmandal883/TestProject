package SimplyCoding;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}
			
		}if(count==2) {
			System.out.println("this is prime number");
		}else {
			System.out.println("this is not prime number");
			
		}
		
		
	}

}
