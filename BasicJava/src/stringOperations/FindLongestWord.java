package stringOperations;

public class FindLongestWord {

	public static void main(String[] args) {
		String s="This is a Elephant and he is ";
		s+=" ";
		String word="";
		String lword="";
		int end=0;
		int position=0,l=0;
		while(s.indexOf(" ", position)>0) {
			end=s.indexOf(" ", position);
			word=s.substring(position,end);
			if(word.length()>l){
				l=word.length();
				lword=word;
			}
			position=end+1;
		}
		System.out.println("word ["+lword+"] word length is "+l);
	}

}
