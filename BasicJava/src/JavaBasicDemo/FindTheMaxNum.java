package JavaBasicDemo;
import java.util.*;
interface Cab{
	public void  journey(String source,String destination,int kilometer);
	
	
	
	
}
public  class FindTheMaxNum {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the source Point");
	String s=scanner.next();
	System.out.println("enter the destination Point");
	String d=scanner.next();
	System.out.println("enter the kilometer");
	int distanceOfStation= scanner.nextInt();
	int k=distanceOfStation*12;
	
		Cab c=(String source,String destination,int kilometer)->System.out.println("this journey is from "+source+" To "+destination+" and your journey bill is :"+kilometer+" for the distance of "+distanceOfStation);
		
		c.journey(s, d,k);
		
		
	}
	

		
}
