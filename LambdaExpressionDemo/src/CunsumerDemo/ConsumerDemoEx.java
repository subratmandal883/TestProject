package CunsumerDemo;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String ename; int salary ;String gender;


	 Employee(String ename, int salary, String gender) {

		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
	
	
}

public class ConsumerDemoEx {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(new Employee("John",50000,"Male"));
		emplist.add(new Employee("Angel",20000,"Female"));
		emplist.add(new Employee("Scott",30000,"Male"));
		emplist.add(new Employee("Mary",40000,"Female"));
		
		//Function interface method
		
		Function<Employee, Integer> f=emp->(emp.salary*10) /100; //task1
		//predicate interface method
		Predicate<Integer> p=b->b>=2000;		//task2
		//Consumer interface method
		
		Consumer<Employee> c=emp->{					//task3
			System.out.println(emp.ename );
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};
		
		for(Employee e:emplist) {
			int bonus=f.apply(e);	//calculate the bonus //invoke the function
			
			if(p.test(bonus)) {		//invoke predicate 
				c.accept(e); 		//invo ke consumer
				System.out.println(e.ename +" employee bonus :"+bonus);
			}
		}
			

	}

}
