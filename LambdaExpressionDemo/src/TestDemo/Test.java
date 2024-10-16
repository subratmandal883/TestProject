package TestDemo;


interface Cab {
	public void bookCab(String source , String destination);

}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab cab = (source,destination)->System.out.println("ola cab is Booked...Your trip is booked for "+source +" to "+destination);
		cab.bookCab("pune","auragabad");

	}

}
