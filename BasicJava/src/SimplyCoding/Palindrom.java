package SimplyCoding;

public class Palindrom {

	public static void main(String[] args) {
		int num=123;
		int m=num;
		int sum=0;
		while(num!=0) {
			int d=num%10;
			sum=sum*10+d;
			num=num/10;
		}
		if(sum==m) {
			System.out.println("this is palindrom");
		}else {
			System.out.println("this is not");
		}
		
	}

}
