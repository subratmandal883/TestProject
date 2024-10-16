package stringProblems;

public class ToggleCaseOfCharacter {

	public static void main(String[] args) {
		String s = "@TeSt#123";

		StringBuilder strbuilder=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z') {
				strbuilder.append(Character.toLowerCase(ch));
			}else if(ch>='a'&& ch<='z') {
				strbuilder.append(Character.toUpperCase(ch));
			}else {
				strbuilder.append(ch);
			}
		}
		System.out.println(strbuilder);

	}

}
