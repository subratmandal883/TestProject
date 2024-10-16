package lambdaExpDemoTwo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

 class EmployeeOne{
	String name;
	int salary;
	public EmployeeOne(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<EmployeeOne> al=new ArrayList() ;
		al.add(new EmployeeOne("David",50000));
		al.add(new EmployeeOne("John",30000));
		al.add(new EmployeeOne("Mary",20000));
		
		Function<EmployeeOne,Integer> f=e->{
			int sal=e.salary;
			if(sal>10000 && sal<20000) {
				return (sal*5/100);
			}else if(sal>20000 && sal<30000) {
				return (sal*7/100);
			}else if(sal>30000 && sal<40000) {
				return (sal*10/100);
			}else if(sal>40000 && sal<50000) {
				return (sal*12/100);
			}else
			return sal*15/100;
		};
		
		Predicate<Integer> b=n->(n>4000);
			
		for(EmployeeOne emp:al) {
			int bonus=f.apply(emp);
			if(b.test(bonus)) {
			System.out.println(emp.name);
			System.out.println(bonus);
		}}
	}

}
