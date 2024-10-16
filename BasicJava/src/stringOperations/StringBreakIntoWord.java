package stringOperations;



public class StringBreakIntoWord {

	public static void main(String[] args) {
		String s="This is box";
       s+=" ";
       int position=0,end=0,l=0;
       String word,lword="";
       while(s.indexOf(' ',position)>0) {
    	   end=s.indexOf(' ',position);
    	   word=s.substring(position,end);
    	   position=end+1;
    	   if(word.length()>l) {
    		   lword=word;
    		   l=word.length();
    		  
    	   }
       }
       System.out.println(lword);
       
	}

}
