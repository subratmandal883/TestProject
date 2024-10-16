package regularExpressionDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemoInputByUser {
	 public static void patternMatcherDemoInputByUser(String reg,String str) {
		
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(str);
		boolean match=m.matches();
		System.out.println(match);
	}
	public static void main(String[] args) {
		while(true) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the regular expression");
			String reg=scanner.nextLine();
			System.out.println("enter the string to compare with RE");
			String str=scanner.nextLine();
			patternMatcherDemoInputByUser(reg,str);
			System.out.println("exit program [Y/N]");
			String choice=scanner.nextLine();
			if(choice.equalsIgnoreCase("Y")) {
				System.out.println("thank you for using program");
				break;
				

			}
			
			
		}
	}

}
