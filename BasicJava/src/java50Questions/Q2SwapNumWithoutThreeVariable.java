package java50Questions;

public class Q2SwapNumWithoutThreeVariable {
//2. How do you swap two numbers without using a third variable in Java?
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
