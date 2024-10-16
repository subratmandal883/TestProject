package stringProblems;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		String str="paratha";
		StringBuilder sb=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		sb.append(ch);
		}
		System.out.println(sb);

}
}