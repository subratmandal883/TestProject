package SimplyCoding;

public class StringReverse {

	public static void main(String[] args) {
		String ab="subrat";
		String sb=new StringBuffer(ab).reverse().toString();
		System.out.println("this is reverse:"+sb);
		if(ab.equals(sb)) {
			System.out.println("this is palindrom");
		}else {
			System.out.println("not equals");
		}
		
		

	}

}
