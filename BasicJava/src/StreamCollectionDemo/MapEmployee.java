package StreamCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String empname;
	double salary;
	public Employee(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
}
public class MapEmployee {

	public static void main(String[] args) {
		/*List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(01,"samol",50000));
		employee.add(new Employee(02,"sneha",45000));
		employee.add(new Employee(03,"samol",32000));
		employee.add(new Employee(04,"samol",70000));*/
		List<Employee> employeeList=Arrays.asList(
				new Employee(01,"samol",50000),
				new Employee(02,"sneha",25000),
				new Employee(03,"samol",32000),
				new Employee(04,"samol",70000));
		List<Double> employeeSalList=employeeList.stream()
				.filter(e->e.salary>35000)
				.map(e->e.salary).collect(Collectors.toList());
		System.out.println(employeeSalList);
	}

}
