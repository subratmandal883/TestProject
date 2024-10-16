package lambdaExpDemoTwo;

import java.util.function.Predicate;

public class PredicateEndOperator {
//p1->check no is even
//p2->check no is greater then 50	
	public static void main(String[] args) {
		int a[]= {5,10,15,20,25,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1=i->(i%2==0);
		Predicate<Integer> p2=i->(i>50);

		for(int n:a) {
			/*
			 * if(p1.and(p2).test(n))//Predicate and method { System.out.println(n); }
			 * if(p1.or(p2).test(n))//Predicate or method { System.out.println(n); }
			 */
			if(p1.negate().test(n))//Predicate or method 
			{
				System.out.println(n);
			}	
			
		}
	}

}
