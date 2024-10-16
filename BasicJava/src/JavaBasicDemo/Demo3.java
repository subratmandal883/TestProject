
package JavaBasicDemo;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
	//jagged Array 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size");
		int row=sc.nextInt();
		System.out.println("Enter the first column element size");
		int firstColumn=sc.nextInt();
		System.out.println("Enter the Second column element size ");
		int secondColumn=sc.nextInt();
		System.out.println("Enter the Third column element size ");
		int thirdColumn=sc.nextInt();
		int[][] num=new int[row][];
		
		num[0]= new int[firstColumn];
		num [1]=new int[secondColumn];
		num[2]=new int[thirdColumn];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j]=sc.nextInt();  
			}
		}
		System.out.println("you have entered the table elements");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {System.out.print(num[i][j]+" ");}
			System.out.println();
		}
		

	}

}
