package JavaBasicDemo;

import java.util.Scanner;

public class StartWithEndsWithMethods {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("plese enter the name or password");
		String name=scanner.next();
	
			if(name.startsWith(name)==false  ) {
				if(name.endsWith(name)==false) {
					System.out.println("please check the first letter  and the lase letter the Correct One");}
			}
			else if(name.startsWith(name)==true ) {
				if( name.endsWith(name)==true) {
					System.out.println(" the Correct One");}
				
			}
			else {
				System.out.println("something else for occured error");
			}
		
	}

}
