package java50Questions;

public class FindOdd {
	public static void findOdd(int[] num) {
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.print(num[i]+" ");
			}
		}
	}
public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,10,13,17};
		
		findOdd(num);


}}


	


