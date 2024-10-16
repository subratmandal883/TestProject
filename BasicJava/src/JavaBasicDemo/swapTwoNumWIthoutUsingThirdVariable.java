package JavaBasicDemo;

public class swapTwoNumWIthoutUsingThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(" Previouslu "+ a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" After "+a+" and "+b);

	}
	

}
