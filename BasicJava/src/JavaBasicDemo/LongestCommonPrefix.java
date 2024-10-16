package JavaBasicDemo;
public class LongestCommonPrefix {
	 String result;
	public String common(String s1,String s2){
		int smallNum= Math.min(s1.length(), s2.length());
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<smallNum;i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				stringBuilder.append(s1.charAt(i));
			}else {
				break;
			}
			
		}
		return stringBuilder.toString();
	}
	
	public String common(String[] str) {
		String result=str[0];
		for(int i=1;i<result.length();i++) {
			result=common(result,str[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		
		LongestCommonPrefix v=new LongestCommonPrefix();
		String[] s= {"abcdd","abc","abcdfa"};
		System.out.println(v.common(s));

	}

}
