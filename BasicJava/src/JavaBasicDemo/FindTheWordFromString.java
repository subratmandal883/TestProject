package JavaBasicDemo;

import java.util.Scanner;

public class FindTheWordFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence to count word");
		String s=sc.nextLine();
		int count=1;
		String reverse="";
		for(int i=0;i<s.length()-1;i++) {
			
			if((s.charAt(i)==' ')&&(s.charAt(i)+1!=' ')) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
