package codingPractice;

import java.util.ArrayList;

import java.util.List;

public class OddContainsInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				int odd=arr[i];
				System.out.println("ODD:"+odd);
			}
			
			
		}
		

	}

	
}
