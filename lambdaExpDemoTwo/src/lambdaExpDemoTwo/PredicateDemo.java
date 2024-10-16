package lambdaExpDemoTwo;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		//exp 1
		Predicate<Integer> i=n->(n>10);
		//System.out.println(i.test(20));
		//exp 2
		Predicate<String> str=s->s.length()>4;
		//System.out.println(str.test("subrat"));
		//System.out.println(str.test("john"));
		//String array to compare
		
		String[] names= {"john","marry","mohan","peter"};
		for(String name:names) {
			if(str.test(name)) {
				
				System.out.println(name);
			}
			}
		

	}

}
