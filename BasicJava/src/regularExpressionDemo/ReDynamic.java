package regularExpressionDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReDynamic {
public static void checkStringAgainstRe(String re,String input){
	Pattern p=Pattern.compile(re);
	Matcher m =p.matcher(input);
	boolean result=m.matches();
	System.out.println(result);
	
}
	public static void main(String[] args) {
		while(true) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Expression");
			String re=s.nextLine();
			System.out.println("Enter the user Input");
			String input=s.nextLine();
			
			checkStringAgainstRe(re, input);
			
			System.out.println("want to exit [Y/N]");
			String choice=s.nextLine();
			if(choice.equalsIgnoreCase("y")) {
				System.out.println("thank you using application");
				break;
			}
		}
	}

}
