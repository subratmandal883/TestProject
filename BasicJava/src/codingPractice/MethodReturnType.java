package codingPractice;

public class MethodReturnType {
	
	public static void main(String[] args) {
		sample(4,5);
	  int sum =addTwoNumbers(3,2);
	   System.out.println(sum);
	}
	public static void sample(int x,int y) {
		System.out.println(x+y);
	}
	public static int addTwoNumbers(int x,int y) {
		
		int sum=x+y;
		
		return sum;
	}

}
