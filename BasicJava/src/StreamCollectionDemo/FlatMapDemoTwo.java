package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemoTwo {

	public static void main(String[] args) {
		List<String> teamA=Arrays.asList("Scott","Devid","John");
		List<String> teamB=Arrays.asList("Mary","Luna","Tom");
		List<String> teamc=Arrays.asList("Ken","Jonny","Kitty");
		

	List<List<String>> wholeTeam=Arrays.asList(teamA,teamB,teamc);

	wholeTeam.stream().flatMap(t->t.stream()).sorted().forEach(n->System.out.println(n));
	
}
}