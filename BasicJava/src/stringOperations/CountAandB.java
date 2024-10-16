package stringOperations;

import java.util.Scanner;

public class CountAandB {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter the sentence");
		String str="enter the sentence";
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			c=Character.toLowerCase(c);
			if(c=='e') {
				count1++;
			}else if(c=='t') {
				count2++;
			}
			
		}
		System.out.println("count of E: "+count1);
		System.out.println("count of T: "+count2);
	}

}
