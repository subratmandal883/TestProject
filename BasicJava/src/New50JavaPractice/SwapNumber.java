package New50JavaPractice;

public class SwapNumber {
//Swapping numbers without using a third variable 
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("after");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
