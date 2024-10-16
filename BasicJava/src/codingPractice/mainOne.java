package codingPractice;

import java.util.Scanner;

public class mainOne {

	public static void main(String[] args) {
		
		String rev=" ";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your name and surname");
        String input=sc.nextLine();
        String[] input1=input.split(" ");
       String first= input1[0] ;
       String second=input1[1];
       for(int i=0;i<second.length();i++) {
    	   char c=second.charAt(i);
    	   rev=c+rev;
       }
       System.out.println(first+" "+rev);
    }
}