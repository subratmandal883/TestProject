package lambdaExpDemoTwo;
import java.util.ArrayList;
import java.util.function.Predicate;
class Demo{
	private String name;
	private int sal;
	private int exp;
	private int age;
	public Demo(String name, int sal, int exp, int age) {
		this.setName(name);
		this.setSal(sal);
		this.setExp(exp);
		this.setAge(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
}
public class EmpClass {
	public static void main(String[] args) {
		Predicate<Demo> emp=n->(n.getAge()>30 && n.getSal()>25000);
		ArrayList<Demo> al=new ArrayList<Demo>();
		al.add(new Demo("John",50000,5,45));
		al.add(new Demo("Devid",20000,2,36));
		al.add(new Demo("Scott",30000,3,35));
		al.add(new Demo("Scott",50000,5,55));
		for(Demo d:al) {
			if(emp.test(d)) {
				System.out.println(d.getName()+" "+d.getSal()+" "+d.getAge());
			}
		}
	}
}
