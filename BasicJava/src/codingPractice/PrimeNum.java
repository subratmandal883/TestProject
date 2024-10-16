package codingPractice;

import java.util.Scanner;

//find the prime number
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number tp chack it prime no");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0 ) ;
			count++;
		}
		if(count==2) {
			System.out.println("this not prime number");
		}else {
			System.out.println("this  is prime number");
		}
	}

}
