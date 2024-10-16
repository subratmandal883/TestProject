package java50Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Write a Java program to check if a vowel is present in a string.
public class VowelsFind {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the content to check vowels");
		String s=scanner.nextLine();
		Pattern p=Pattern.compile("[aeiou]*");
		Matcher m=p.matcher(s);
		boolean match=m.matches();
		if(match==true) {
			System.out.println("vowels is present");
		}else {
			System.out.println("not present");
		}
		
	}

}
