package shekharSirPrograms;

import java.util.Scanner;
/*Write a Program to check if the student has passed/failed .
Below 40% marks fail,
above this pass . Use if-else loop*/

public class StudentResult {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("please enter the marks");
		int input=s.nextInt();
		marksEnter(input);
	}
	public static int marksEnter(int marks) {
		int obtain=(marks/100)*100;
		if(obtain<40) {
			System.out.println("YOu are fail");
		}else {
			System.out.println("you are pass");
		}
		
		return obtain;
	}

}
