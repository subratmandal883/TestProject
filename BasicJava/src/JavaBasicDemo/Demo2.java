package JavaBasicDemo;
import java.util.*;

public class Demo2 {
	
	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the Element numbers for two dimentions:");
int n=sc.nextInt();
int m=sc.nextInt();
int num[][]=new int[n][m];
System.out.println("you have entered the 2D array of "+n+" by "+m);
System.out.println("enter the array element as above");
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		num[i][j]=sc.nextInt();
	}
}
System.out.println("you have entered :");
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		System.out.print(num[i][j]+"   ");
	}
	System.out.println();
}
}

}


	
	


