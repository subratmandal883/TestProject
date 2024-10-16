package stringOperations;

import java.util.Scanner;

public class SplitStringIntoWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence to find the word count");
		String s=sc.nextLine();
		int count=0;
		String[] words=s.split("\\s");
		for(String result:words) {
			
			System.out.println(result );
			count++;
		}
		
		System.out.println("the word count is:"+count);
	}

}
