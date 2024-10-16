package java50Questions;

import java.util.ArrayList;
import java.util.List;

public class EvenOrOdd {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(6);
		
		for(Integer n:a) {
			if(n!=0 && n%2!=0) {
				System.out.println("this is odd "+n);
			}
			else  { 
				System.out.println("this is even "+n);}
		}

	}

}
