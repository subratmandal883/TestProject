package java50Questions;

import java.util.Scanner;

public class FindPrimeNum {

	public static void main(String[] args) {
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the number to find the prime number?");
		int num=s.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				temp++;
			}
		}
		if(temp==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}
		
		
		
	}

}
