package JavaBasicDemo;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please senter the number to find the table");
		//int input=sc.nextInt();
		int n=sc.nextInt();
		while(n<=10) {
			
			n++;
		}
		System.out.println(n+" ");

	}

}
