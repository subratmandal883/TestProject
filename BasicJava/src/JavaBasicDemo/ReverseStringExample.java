package JavaBasicDemo;

import java.util.Scanner;

public class ReverseStringExample {
	static int count=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence to count");
		String text=s.nextLine();
		
		for(int i = 0;i<text.length();i++) {
			char c=text.charAt(i);
			try {
				count++;
				if(count>10) {
					System.out.println("enter only below 10 words");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("character length is "+count);
	}

}
