package FunctionTest;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		
		//Integer operation in Function Interface 
		Function<Integer, Integer> f=n->(n*n);
		
		System.out.println(f.apply(5));//25
		System.out.println(f.apply(10));//100
		System.out.println(f.apply(2));//4
		
		//string operation in Function Interface 
		Function<String, Integer> f1=n->(n.length());
		
		System.out.println(f1.apply("This is India")); //13
		System.out.println(f1.apply("Welcome"));	//7
	}

}
