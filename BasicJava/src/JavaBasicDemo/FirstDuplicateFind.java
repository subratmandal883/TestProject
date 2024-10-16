package JavaBasicDemo;

import java.util.HashSet;

public class FirstDuplicateFind {
public static Integer firstduplicateNumber(int[] nums) {
	
	HashSet<Integer> set=new HashSet<Integer>();
	
	for(int num:nums) {
		if(set.contains(num)) 
		{
			return num;
		}
		set.add(num);
	}
	return null;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,4,6,7};
		
		
	}

}
