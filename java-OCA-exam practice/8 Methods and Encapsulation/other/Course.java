package other;
import java.util.List;
import java.util.ArrayList;
import test.Student;
/*
7. Create a class named Course in different package. Add a static method named enroll in this class that accepts a Student. Use different access modifiers for fields of Student class and try to access them from the enroll method.
*/

public class Course{
	public String name;
	public static List<Student> enrolled = new ArrayList<>();
	
	public static void enroll(Student s){
		enrolled.add(s);
		System.out.println("Added student "+s.name+" to the list of enrolled students");
	}
}