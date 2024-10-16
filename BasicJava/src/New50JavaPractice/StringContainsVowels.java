package New50JavaPractice;

import java.util.Scanner;

public class StringContainsVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String input=sc.nextLine();
		input=input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("there is vowels present : "+ch);
			}else {
				System.out.println("console present :"+ch);
			}
		}
		
	}
}
