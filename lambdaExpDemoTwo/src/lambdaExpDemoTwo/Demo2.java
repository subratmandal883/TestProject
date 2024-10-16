package lambdaExpDemoTwo;

//import java.util.Scanner;

interface CabBook{
	public String cabBook(String source,String destination);
}
//element the ola class to create lambda expression
/*
 * class Ola implements CabBook{ public String cabBook(String source,String
 * destination) {
 * System.out.println("cab booked from "+source+" to "+destination); return
 * ("Price : 5000rs"); } }
 */
public class Demo2 {

	public static void main(String[] args) {
		
		CabBook o=( source, destination)->{
			System.out.println("cab booked from "+source+" to "+destination);
			return ("Price : 5000rs");
		};
		System.out.println(o.cabBook("hyd", "mumbai"));
			
	}

}
