package stringOperations;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to find the eligibility");
		int n=s.nextInt();
		switch (n) {
		case (18):
			
			System.out.println("you are aligible for voting");
			break;
		case 25:
			System.out.println("you are aligible for buy House");
			break;
		case 30:
			System.out.println("you are aligible marriage");
			break;

		default:
			System.out.println("enter the proper number");
			break;
		}
		
	}

}
