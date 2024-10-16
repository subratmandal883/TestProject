package PredicateTest;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter the number");
	
		
		/*
		 * Predicate<Integer> num=n ->(n*20>100);
		 * 
		 * boolean result=num.test(s.nextInt()); if(result ==true) {
		 * System.out.println("this is bigger number to 100"); }else {
		 * System.out.println("this is smaller number to 100"); }
		 */
		
		Predicate<String> namelength=n->(n.length()>4);
		//System.out.println(namelength.test("subrat"));
		Function<String, Integer> f=n->(n.length());
		String name[]= {"scott","Angel", "matheu","max"};
		for(String nameFind:name) {
			//System.out.println(namelength.test(nameFind));
			//System.out.println(f.apply(nameFind)); 
			//System.out.println("this is to check length of name is length >4 ");
			System.out.println(namelength.test(nameFind));
			
		}
		

		
		
	}

}
