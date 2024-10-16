package stringOperations;

public class FindWordFromString {

	public static void main(String[] args) {
		String s = "This is string";
		s += " ";
		String word = "";
		String lword = " ";
		int l1 = 0;
		int position = 0, end = 0;
		while (s.indexOf(" ", position) > 0) {
			end = s.indexOf(" ", position);
			word = s.substring(position, end);

			if (word.length() > l1) {
				lword = word;
				l1 = word.length();
			}
			position = end + 1;

		}
		System.out.println("long word is " + lword + " its length is " + l1);

	}

}
