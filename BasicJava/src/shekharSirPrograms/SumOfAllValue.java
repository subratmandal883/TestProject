package shekharSirPrograms;

import java.util.Scanner;

public class SumOfAllValue {

	public static void main(String[] args) {
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the value");
			int value=0;
			int n=scan.nextInt();
			for(int i=1;i<=n;i++) {
				value+=i;
			}
			System.out.println(value);
			
		
	}

	}
	}
