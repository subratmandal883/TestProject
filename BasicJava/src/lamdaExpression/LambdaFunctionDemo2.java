package lamdaExpression;

import java.util.ArrayList;
import java.util.function.Function;

class FunctionDem{
	String name;
	int salary;
	 FunctionDem(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
}
public class LambdaFunctionDemo2 {

	public static void main(String[] args) {
		ArrayList<FunctionDem> a=new ArrayList<FunctionDem>();
		a.add(new FunctionDem("Devid",50000));
		a.add(new FunctionDem("John",30000));
		a.add(new FunctionDem("Mary",20000));
		Function<FunctionDem, Integer> fn= e->{
			int sal=e.salary;
			if(sal>10000 && sal<20000) {
				return (sal*5/100);
			}if(sal>20000 && sal<30000) {
				return (sal*7/100);
			}if(sal>30000 && sal<40000) {
				return (sal*10/100);
			}if(sal>40000 && sal<50000) {
				return (sal*12/100);
			}else {
				return  (sal*15/100);
			}
			
		};
		for(FunctionDem f:a) {
			int bonus=fn.apply(f);
			System.out.println(f.name+" "+f.salary+" "+bonus);
		}
	}

}
