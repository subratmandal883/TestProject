package JavaBasicDemo;

import java.util.Scanner;

public class ReverseStringInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter anything to reverse");
		StringBuffer s=new StringBuffer(sc.nextLine());
		StringBuffer rev=s.reverse();
		System.out.println(rev);
		
	}

}
