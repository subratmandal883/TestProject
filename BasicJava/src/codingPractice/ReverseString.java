package codingPractice;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the para");
			String name=sc.nextLine();
			String rev = " ";
			int len=name.length();
			for(int i=0;i<len;i++) {
				 char r=name.charAt(i);
				 rev=r+rev;
			}
			System.out.println(rev);
		}
	}

}
