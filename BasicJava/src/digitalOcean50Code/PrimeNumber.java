package digitalOcean50Code;

import java.util.Scanner;
//4. Write a Java program to check if the given number is a prime number.
public class PrimeNumber {

	public static void main(String[] args) {
		int n,count=0;
		System.out.println("enter any number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0 && i==1) {
				count++;
			}}
			if(count==2) {
				System.out.println("prime number");
			}else {
				System.out.println("not prime number");
			}
		

	}

}
