package streamCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Student {
	String sName;
	int sId;
	char grade;
	public Student(String sName, int sId, char grade) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.grade = grade;
	}
	
	
	
	
}
public class StreamStudents {

	public static void main(String[] args) {
		List<Student> student1=new ArrayList<Student>();
		student1.add(new Student("Scarlett",101,'B'));
		student1.add(new Student("Ethan",102,'A'));
		student1.add(new Student("Jasmine",103,'D'));
		student1.add(new Student("Caleb",104,'A'));
		
		List<Student> student2=new ArrayList<Student>();
		student2.add(new Student("Isabella",105,'B'));
		student2.add(new Student("Lucas",106,'D'));
		student2.add(new Student("Ava",107,'B'));
		student2.add(new Student("Noah",108,'A'));
		
		List<List<Student>> sumStudentList=Arrays.asList(student1,student2);
		sumStudentList.stream()
				.flatMap(name->name.stream())
				.map(n->n.sName).forEach(n->System.out.println(n));
		
	}

}
