package stringOperations;

import java.util.Scanner;

public class FindTheLongestStringWord {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sentence to find the Longest Word ");
		String s=scanner.nextLine();
		System.out.println(findTheLargest(s));
	}
	public static String findTheLargest(String s) {
		int count = 0;
		String[] word=s.split(" ");
		String longword=" ";
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>longword.length()) {
				longword=word[i];
				count++;
			}
			
		}return longword+count;
	}

}
