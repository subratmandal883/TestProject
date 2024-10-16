package stringOperations;

import java.util.Scanner;

public class StringFirstCharUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence to find first char uppercase");
		String s=sc.nextLine();
		s=" "+s;
		int len=s.length();
		for(int i=0;i<len;i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				System.out.print(" "+Character.toUpperCase(s.charAt(i+1)));
				i=i+1;
			}else {
				System.out.print(ch);
			}
			
		}
		System.out.println();
		
	}

}
