package SimplyCoding;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 String input = "banana";
		 StringBuffer result=new StringBuffer();
		
		 LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(char c: input.toCharArray()) {
			if(set.add(c)) {
				result.append(c);
			}
		}
		System.out.println(result);

	}

}
