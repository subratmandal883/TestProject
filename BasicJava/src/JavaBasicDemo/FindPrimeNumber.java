package JavaBasicDemo;
import java.util.*;
public class FindPrimeNumber {

	public static void main(String[] args) {
		int n,count = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to find prime number");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			
			if(n%i==0 && i==1) {
				count++;
			}
		}
		
		if(count==2) {System.out.println("yes it is prime number");}
		else if(count>3) {System.out.println("yes it is composite number");
	
		}
		else if(count !=2) {
			
			System.out.println("no this is not prime number");
			
		}else if(count<3) {
			
			
			System.out.println("no this is not composite number");
		}else {
			System.out.println("something wrong");
		}
	}

}
