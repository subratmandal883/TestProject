package JavaBasicDemo;

public class ConvertIntToString {
	public static void main(String[] args) {
		int i=10;
		String n=String.valueOf(i);//int to String 
		//System.out.println(n);
		String s="9990449935";  
		long longg=Long.valueOf(s);//string to long
		//System.out.println(longg);
		long l=9993939399L;  
		
		String s1=Long.toString(i);//Now it will return "9993939399"  
		System.out.println(s1);
	}
}
