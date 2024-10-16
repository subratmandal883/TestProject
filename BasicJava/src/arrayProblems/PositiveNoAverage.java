package arrayProblems;

public class PositiveNoAverage {

	public static void main(String[] args) {
		int[] arr={-3,-2,0,-7,25,12,-11};
		double positive=0.0;
		double avg=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive=positive+arr[i];
				count++;
				
			}
			
		}
		avg=positive/count;
System.out.println(avg);
	}

}
/*for(int i=0;i<s.length();i++) {
if(i==0||s.charAt(i-1)==' ') {
	System.out.print(s.charAt(i)+" ");
}

}*/