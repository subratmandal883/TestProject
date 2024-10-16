package InterviewCodePractice;

public class SwipingVariable {

	public static void main(String[] args) {
		//Swapping numbers without using a third variable 
		
		int a=10;
		int b=20;
		
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
