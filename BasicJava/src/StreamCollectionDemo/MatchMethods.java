package StreamCollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class MatchMethods {

	public static void main(String[] args) {
		
		//matchAll,anyMatch,noneMatch
		Set<String> fruits=new HashSet<>();
		
		fruits.add("one apple");
		fruits.add("one Mango");
		fruits.add("two apple");
		fruits.add("more grapes");
		fruits.add("two guava");
		
		boolean result=fruits.stream().anyMatch(n->{
			return n.startsWith("one");
		});
		System.out.println(result); 
		boolean result2=fruits.stream().allMatch(n->{
			return n.startsWith("one");
		});
		System.out.println(result2); 
		boolean result3=fruits.stream().noneMatch(n->{
			return n.startsWith("one");
		});
		System.out.println(result3); 

	}

}
