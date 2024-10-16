package digitalOcean50Code;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="subrat mandal";
		String rev="";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			rev=c+rev;
		}
		System.out.println("Reverse :"+rev);
	}

}
