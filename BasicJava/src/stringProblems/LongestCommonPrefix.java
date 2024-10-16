package stringProblems;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		StringBuilder result=new StringBuilder();
		String[] strs= {"sneham","sneha","sneyna"} ;
		Arrays.sort(strs);
		char[] first=strs[0].toCharArray();
		char[] end=strs[strs.length-1].toCharArray();
		
		for(int i=0;i<strs.length;i++){
			if(first[i]!=end[i]) {
				break;
			}else {
				result.append(first[i]);
			}
			
		}
		System.out.println(result.toString());
		
	}
	

}
