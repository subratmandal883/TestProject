package TestDemo;

interface Taxi{
	public String bookCab(String source,String destination);
	
	
}
public class TestTwo {
	public static void main(String[] args) {
		Taxi taxi=(source,destination)->{System.out.println("ola cab is Booked...Your trip is booked for "+source +" to "+destination);
		return ("Price is: 5000");
		};
		System.out.println(taxi.bookCab("Hydrabad","Pune"));
	}

}
