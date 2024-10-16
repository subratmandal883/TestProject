package arrayProblems;

import java.util.HashMap;

public class FindTheSumNonRepeatingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {10,15,15,20,10,30};
		int sum=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n.length;i++) {
			if(map.containsKey(n[i])) {
				map.put(n[i], map.get(n[i])+1);
			}else {
				map.put(n[i], 1);
			}
		}
		for(int result:map.keySet()) {
			if(map.get(result)==1) {
				sum=sum+result;
			}
		}
		System.out.println(sum);
	}

}
