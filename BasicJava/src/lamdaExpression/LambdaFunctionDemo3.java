package lamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunctionDemo3 {
private String name;
private int salary;

	public LambdaFunctionDemo3(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}

	public static void main(String[] args) {
		List<LambdaFunctionDemo3> b=new ArrayList<LambdaFunctionDemo3>();
		b.add(new LambdaFunctionDemo3("subrath",2000));
		b.add(new LambdaFunctionDemo3("sneha",3000));
		b.add(new LambdaFunctionDemo3("linda",2000));
		b.add(new LambdaFunctionDemo3("max",4000));
		for(LambdaFunctionDemo3 r:b) {
			 int percent=(5*100)/100;
			 
		}
		
		
		
		
	}

}
