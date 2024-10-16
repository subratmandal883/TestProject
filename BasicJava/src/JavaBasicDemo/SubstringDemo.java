package JavaBasicDemo;

public class SubstringDemo {

	public static void main(String[] args) {
		String str="Subrat Mandal";
		StringBuffer sb=new StringBuffer(str);
		String newsb=sb.reverse().toString();
		System.out.println(newsb);
		}

}
