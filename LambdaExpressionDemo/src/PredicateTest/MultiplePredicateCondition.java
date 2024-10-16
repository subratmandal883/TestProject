package PredicateTest;

import java.util.ArrayList;
import java.util.function.Predicate;

 class Employee{
	String ename;
	int salary;
	int experiance;
	public Employee(String ename, int salary, int experiance) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.experiance = experiance;
	}
	
}
public class MultiplePredicateCondition {

	public static void main(String[] args) {
		
		//Expmple1
		//Employee emp=new Employee("David",40000,2);
		//employee object-> sal>50 + exp>3
		Predicate<Employee> pr=e->(e.salary>30000 || e.experiance>3);
		//System.out.println(pr.test(emp));
		
		//Example 2
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("John",50000,5));
		al.add(new Employee("David",20000,2));
		al.add(new Employee("Scott",30000,3));
		al.add(new Employee("Mary",40000,6));
		
for(Employee emp:al) {
	if(pr.test(emp)) {
		System.out.println(emp.ename+" "+emp.salary);
	}
}
		
		
	
	}

}
