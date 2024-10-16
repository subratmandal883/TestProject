package shekharSirPrograms;

public class EmployeeSalary {
	//individual variable
	String name;
	String city;
	//common variable
	static String company="LexisNexisRisk";
	public int calculateSalary(int perDaySal,int attendence){
		int salary=perDaySal*attendence;
		return salary;
	}
	public static int calculateTaxNPF(int salary){
		int tax = salary/10; 
		int pf = salary/20;
		int taxnpf = tax+pf; 
		return taxnpf;
	}
	public void finalSal(int salary,int taxnpf) {
		
	}

	public static void main(String[] args) {
		EmployeeSalary akshay=new EmployeeSalary();
		EmployeeSalary aniket=new EmployeeSalary();
		EmployeeSalary vijay=new EmployeeSalary();
		
		int sal1=akshay.calculateSalary(1000, 30);
		int sal2=aniket.calculateSalary(2000, 20);
		int sal3=vijay.calculateSalary(3000, 27);
		
		int finalsal1=sal1-akshay.calculateTaxNPF(sal1);
		int finalsal2=sal2-aniket.calculateTaxNPF(sal2);
		int finalsal3=sal3-vijay.calculateTaxNPF(sal3);
 
		
		System.out.println("Akshay's Salary is "+sal1+" and with TaxnPf "+finalsal1);
		System.out.println("Aniket's Salary is "+sal2+" and with TaxnPf "+finalsal2); 
		System.out.println("Vijay's Salary is "+sal3 +" and with TaxnPf "+finalsal3);
	}

}
