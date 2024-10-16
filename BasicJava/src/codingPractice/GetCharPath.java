package codingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetCharPath {

	public static void main(String[] args) {
		String path="this is new Generation";
		path+=" ";
		int position=0,end=0;
		String word=" ";
		String lword=" ";
		int l1=0;
		while(path.indexOf(" ",position)>0) {
			end=path.indexOf(" ",position);
			word=path.substring(position,end);
			if(word.length()>l1) {
				lword=word;
				l1=word.length();
			}
			position=end+1;
		}
		System.out.println("long word is " + lword + " its length is " + l1);

	}

}
