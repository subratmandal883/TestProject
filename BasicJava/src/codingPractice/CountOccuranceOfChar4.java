package codingPractice;

public class CountOccuranceOfChar4 {
 public static void main(String[] args) {
	 String str="this is testing matter";
	 int len=str.length();
	 int[] count=new int[400];
	 for(int i=0;i<len;i++) {
		 count[str.charAt(i)]++;
	 }
	 for(int i=0;i<400;i++) {
		 if(count[i]>0) {
			 System.out.println((char)i+"-->"+count[i]);
		 }
	 }
}
  
}
