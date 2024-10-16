package lamdaExpression;
interface Cab{
	public void bookCab();
}
 
public class Test {

	public static void main(String[] args) {
	
Cab cab=()->System.out.println("the cab is booked");
cab.bookCab();                  
	}

}
