package FunctionTest;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	 String name;
	 int salary;
	public Employee(String name, int salary) {
	
		this.name = name;
		this.salary = salary;
	}
	
}
public class EmployeeData {

	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("David",50000));
		emplist.add(new Employee("John",30000));
		emplist.add(new Employee("Mary",20000));
		emplist.add(new Employee("Vivek",40000));
		
		Function<Employee, Integer> fn=e->{
			int sal=e.salary;
			
			if(sal>=10000 && sal<=20000) {
				return sal*10/100;
			}else if(sal>20000 && sal<=30000) {
				return sal*20/100;
			}else if(sal>30000 && sal<=50000) {
				return sal*30/100;
			}
			return sal*40/100;
		};
		
		Predicate<Integer> p=n->n>5000;
		
		
		for(Employee emp:emplist) {
			
			int bonus=fn.apply(emp);//Function method
			if(p.test(bonus)) { 	//predicate method
				System.out.println(emp.name +" "+ emp.salary);
				System.out.println("your bonus is :"+bonus);
			}
		}

	}

}
