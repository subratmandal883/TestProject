package codeChucks;

import java.util.HashMap;

public class CountTheFrequencyOfEachElement {

	public static void main(String[] args) {
		int[] a= {20,30,50,30,20,40};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a)) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(Integer c:map.keySet()) {
			if(map.get(c)==1) {
				System.out.println(c+" ");
			}
		}
	}

}
