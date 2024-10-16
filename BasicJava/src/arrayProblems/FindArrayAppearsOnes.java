package arrayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindArrayAppearsOnes {

	public static void main(String[] args) {
		int[] arr= {10,15,15,20,10,30};
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set);
		}
		
		
	}


