package lambdaExpDemoTwo;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	int experiance;
	public Employee(String name, int salary, int experiance) {
		super();
		this.name = name;
		this.salary = salary;
		this.experiance = experiance;
	}
	
}
public class PredicateDemo2 {

	public static void main(String[] args) {
		Employee emp=new Employee("sunil",34000,3);
		//exp 1
		//emp object -->return name of sal>30k exp>3
		Predicate<Employee> t=e->(e.salary>40000 && e.experiance>2);
	
		if(t.test(emp)) {
			//System.out.println(emp.name+" "+emp.salary+" "+emp.experiance);
		
	}
		//exp 2
		ArrayList<Employee> el=new ArrayList<Employee>();
		el.add(new Employee("sunil",34000,3));
		el.add(new Employee("max",44000,6));
		el.add(new Employee("sunil",45000,4));
		el.add(new Employee("sonu",33000,2));
		for(Employee ell:el) {
			if(t.test(ell)) {
				System.out.println(ell.name);
			}
			
		}
	}

}
