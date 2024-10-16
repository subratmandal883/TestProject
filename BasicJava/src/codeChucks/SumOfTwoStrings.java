package codeChucks;

public class SumOfTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="234";
		String b="34";
		int num1=0;
		int num2=0;
		for(int i=0;i<a.length();i++) {
			num1=num1*10+a.charAt(i)-48;
		}
		for(int i=0;i<b.length();i++) {
			num2=num2*10+b.charAt(i)-48;
		}
		System.out.println(num1+num2);
	}

}
