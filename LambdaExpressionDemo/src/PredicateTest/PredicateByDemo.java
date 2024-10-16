package PredicateTest;

import java.util.function.Predicate;

public class PredicateByDemo {

	public static void main(String[] args) {
		
		//predicate test method for interger
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		//predivate test() method for String operation
		Predicate<String> ps=i->(i.length()<=4);
		System.out.println(ps.test("subrat"));
		System.out.println(ps.test("abc"));
		//predicate test() for array type of value
		
		String names[]= {"David","Scott","Smith","John","Mary"};
		for(String name:names) {
			if(ps.test(name)) {
				
				System.out.println("This name is length is greater then 4 :"+name);
			}
		}
	}

}
