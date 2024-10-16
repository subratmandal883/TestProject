package JavaBasicDemo;

//import java.util.Scanner;

public class CountingFrequencyofString {

	public static void main(String[] args) {
		String rev = null;
		StringBuilder sb=new StringBuilder("mentalHospital");
		System.out.println(sb.length());
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			rev=ch+rev;
			}	
		System.out.println(rev);
		}
		
	}


