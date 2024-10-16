package java50Questions;

public class Q5Fibonacci {
	public static void PrintFibonacci(int count){
		int a=0,b=1,c=1;
		for(int i=0;i<count;i++) {
			System.out.println(a+" , ");
			
			a=b;
			b=c;
			c=a+b;
			
		}
		
	}
	public static void main(String[] args) {
		
		PrintFibonacci(10);

	}

}
