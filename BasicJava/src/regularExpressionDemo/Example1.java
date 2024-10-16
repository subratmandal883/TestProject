package regularExpressionDemo;

import java.util.regex.*;


public class Example1 {

	public static void main(String[] args) {
		
		
		String s="This";
		Pattern pt=Pattern.compile("a*b*");
		Matcher mach=pt.matcher("aaabbbb");
		boolean result=mach.matches();
		System.out.println("Result:"+result);
	}

}
