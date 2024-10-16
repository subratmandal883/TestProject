package java50Questions;

import java.util.Scanner;

public class Q1ReverseString {
//1. How do you reverse a string in Java?
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string to reverse");
		String name=s.nextLine();
		String rev="";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);

	}

}
