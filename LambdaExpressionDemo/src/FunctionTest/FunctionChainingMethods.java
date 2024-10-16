package FunctionTest;

import java.util.function.Function;

public class FunctionChainingMethods {

	public static void main(String[] args) {
		Function<Integer, Integer> f1= n->n*2; //4
		Function<Integer, Integer> f2= n->n*n*n; //64
		
		System.out.println(f1.andThen(f2).apply(2)); //64
		
		System.out.println(f1.compose(f2).apply(2));

	}

}
