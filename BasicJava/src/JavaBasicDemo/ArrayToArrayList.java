package JavaBasicDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] arr= {"dog","cat","cow","elephant"};
		
		for(String ar:arr) {
			System.out.println(ar);
		}
		System.out.println("After array converted to arrayList");
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
		

	}

}
