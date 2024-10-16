package StreamCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String sname;
	int sid;
	char grade;
	public Student(String sname, int sid, char grade) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
	
}
public class FlatMapDemoWithConstructor {

	public static void main(String[] args) {
		
		List<Student> studentListOne=new ArrayList<Student>();
		
		studentListOne.add(new Student("Smith",101,'A'));
		studentListOne.add(new Student("John",102,'B'));
		studentListOne.add(new Student("Kenedy",103,'C'));

		List<Student> studentListTwo=new ArrayList<Student>();

		studentListOne.add(new Student("Scott",104,'A'));
		studentListOne.add(new Student("Mary",105,'B'));
		studentListOne.add(new Student("Ketti",106,'C'));
		
		
		List<List<Student>> studentFinalList=Arrays.asList(studentListOne,studentListTwo);
		
		List<String> studentFinal=studentFinalList.stream().flatMap(s->s.stream()).map(s->s.sname).collect(Collectors.toList());
	
		System.out.println(studentFinal);
	}

}
