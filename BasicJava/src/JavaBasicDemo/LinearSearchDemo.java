package JavaBasicDemo;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int[] a={47,86,24,59,72,35,93,18,63,41};
		
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			Arrays.sort(a);
			if(target==a[i]) {
				System.out.println("numbers is present");
				flag=true;
			}
		}
		
		if(flag==false) {
			System.out.println("this no is not present");
		}
	
	}

}
