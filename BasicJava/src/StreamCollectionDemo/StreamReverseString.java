package StreamCollectionDemo;

import java.util.Scanner;

public class StreamReverseString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sentence to reverse");
		String n=scanner.nextLine();
		String reverse="";
		char c;
		
		for(int i=0;i<n.length();i++) {
			
			c=n.charAt(i);
			reverse=c+reverse;
		}
		System.out.println(reverse);

	}

}
