package PredicateTest;

import java.util.function.Predicate;

//Joining predicate and,or and negate;

//p1=number is even
//p2=check no is greater then 50

public class JoinPredicate {
public static void main(String[] args) {
	
	int arr[]= {5,10,15,20,25,30,35,40,45,50,55,60,65};
	Predicate<Integer> p1=i->(i%2==0);
	Predicate<Integer> p2=n->(n>50); 
	
	
	for(int n:arr) {
		//p1.test(n) && p1.test(n)
		//p1.or(p2).test(n)
		if(p1.and(p2).negate().test(n)) {
			System.out.println(n);
		}
	}
}
}
