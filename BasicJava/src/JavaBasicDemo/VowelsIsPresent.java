package JavaBasicDemo;

import java.util.Scanner;

public class VowelsIsPresent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence");
		int count=0;
		String sentence=s.nextLine();
		char[] n= {'a','e','i','o','u'};
		for(int i=0;i<sentence.length();i++) {
			char filter=Character.toLowerCase(sentence.charAt(i));
			if(n.length==filter) {
				
				count++;
				System.out.println(i+" is coming "+count);
			}
		}
		//System.out.println(count);
		

	}

}
