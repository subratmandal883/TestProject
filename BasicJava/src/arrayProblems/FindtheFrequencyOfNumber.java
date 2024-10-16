package arrayProblems;

import java.util.HashMap;

public class FindtheFrequencyOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={20,30,50,30,20,40};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<num.length;i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1);
			}else {
				map.put(num[i], 1);
			}
		}
		System.out.println(map);
	}

}
