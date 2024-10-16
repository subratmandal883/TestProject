package regularExpressionDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a.b");
		Matcher m=p.matcher("aaaab");
		boolean mat=m.matches();
		System.out.println(mat);


	
	
	
	
	
	
	
	
	
	
	
	}

}
