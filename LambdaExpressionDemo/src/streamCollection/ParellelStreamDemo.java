package streamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentDetails{
	String name;
	int score;
	public StudentDetails(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
	public String getName(){
		return name;
	}
	
	
}
public class ParellelStreamDemo {

	public static void main(String[] args) {
		List<StudentDetails> std=Arrays.asList(
				new StudentDetails("David",82),
				new StudentDetails("Bob",90),
				new StudentDetails("John",65),
				new StudentDetails("Canedy",55),
				new StudentDetails("Eric",85),
				new StudentDetails("Smith",88),
				new StudentDetails("Scott",50));
		//sequencial stream
		std.stream().parallel().filter(n->n.getScore()>80).limit(3)
		.forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
		//parallel stream
		System.out.println("----------------------------------");
		std.parallelStream().filter(n->n.getScore()>80).limit(4).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
	}

}
