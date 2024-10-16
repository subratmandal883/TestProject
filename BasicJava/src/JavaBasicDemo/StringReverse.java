package JavaBasicDemo;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		char ch;
		String reverse=" ";
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your name to reverse it");
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			
			reverse=ch+reverse;
		}
		
		System.out.println(reverse);

	}

}
