package java50Questions;
// How do you swap two numbers without using a third variable in Java?
public class SwapTwoNum {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a +" and "+ b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a +" and "+ b);
	}

}
