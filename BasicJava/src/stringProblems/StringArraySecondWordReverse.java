package stringProblems;

import java.util.Scanner;

public class StringArraySecondWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name and surname");	
		String rev=" ";
		String name=scan.nextLine();
		String[] nameString=name.split(" ");
		String first=nameString[0];
		String second=nameString[1];
		for(int i=0;i<second.length();i++) {
			char c=second.charAt(i);
			 rev=c+rev;
			
			
		}
		
		System.out.println(first+" "+rev);
	}

}
