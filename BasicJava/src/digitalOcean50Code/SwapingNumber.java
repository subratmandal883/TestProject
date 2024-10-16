package digitalOcean50Code;

public class SwapingNumber {

	public static void main(String[] args) {
		// 2.swap two numbers without using a third variable in Java.
		
		int a=10;
		int b=20;
		System.out.println("before swap");
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap");
		System.out.println(a+" "+b);
	}

}
