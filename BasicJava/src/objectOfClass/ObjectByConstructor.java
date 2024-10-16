package objectOfClass;

public class ObjectByConstructor {
 int rollno;
 String name;


public void empDetails(int r,String n) {
	rollno=r;
	name=n;
}
public void display() {
	System.out.println(rollno+ " "+name);
}
	public static void main(String[] args) {
		
		ObjectByConstructor obc=new ObjectByConstructor();
		ObjectByConstructor obc1=new ObjectByConstructor();
		obc.empDetails(101, "subrat");
		obc1.empDetails(102, "sneha");
	
		obc.display();
		obc1.display();
		
	}
	

}
