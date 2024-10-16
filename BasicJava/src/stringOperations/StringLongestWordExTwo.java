package stringOperations;

public  class StringLongestWordExTwo {
	
public static String longestWord(String l) {
	String[] arr=l.split(" ");
	String longWord=arr[0];
	for(String a:arr) {
		if(longWord.length()<a.length()) {
			longWord=a;
		}
	} 
	return longWord;
}

	public static void main(String[] args) {
		StringLongestWordExTwo fl=new StringLongestWordExTwo();
		String result=fl.longestWord("hey have their own opnions ");
		System.out.println("["+result+"] this is the longest word");
		System.out.println(result.length());
	}

}
