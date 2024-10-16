package lamdaExpression;

import java.util.function.Function;

public class LambdaFunctionDemo {

	public static void main(String[] args) {
		//String n="max";
		Function<String, Integer> f=n->n.length();
	
		System.out.println(f.apply("samir"));
	
	}

}
