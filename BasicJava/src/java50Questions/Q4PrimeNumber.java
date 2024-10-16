package java50Questions;

import java.util.Scanner;

public class Q4PrimeNumber {
//3. Write a Java program to check if a vowel is present in a string.
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		for(int i=0;i<num;i++) {
			if(i%num==0 || i==1) {
				count++;
			}
		}if(count==2) {
			System.out.println("this is prime");
		}

	}

}
