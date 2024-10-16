package lambdaExpDemoTwo;
interface Cab{
	public void bookCab();
}
public class Demo1 {

	public static void main(String[] args) {
		Cab cab=()->System.out.println("cab is booked");
		cab.bookCab();
	}

}
