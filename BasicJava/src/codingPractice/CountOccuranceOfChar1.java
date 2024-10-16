package codingPractice;


public class CountOccuranceOfChar1 {
	public static void main(String[] args) {
		String str="subrat mandal";
		int len=str.length();
		int[] count=new int[400];
		for(int i=0;i<len;i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<400;i++){
			if(count[i]!=0) {
				System.out.println((char)i+"-->"+count[i]);
			}
		}
	}
	
}