package test;
import static test.Student.school;
import other.Course;

class Test{
	public static void main(String[] arg){
	/*
	1. Create a method named add that can accept any number of int values and returns the sum of those values. 
	*/
	print("\nExercise 1, add ints: ");
	print("add 1, 2: "+ add(1, 2));
	print("add 1, 2, 3, 4 =  "+ add(1, 2, 3, 4));
	
	/*
	2. Create another method named add in the same class that can accept any number of int values but returns a String containing concatenation of all those values. What can you do to resolve compilation error due to the presence of the two methods with same signature? Invoke these methods from the main method of this class. 
	*/
	
	print("\nExercise 2, concat ints as strings: ");
	print("(Change signature to addS)");
	print("add 1, 2: "+ addS(1, 2));
	print("add 1, 2, 3, 4 =  "+ addS(1, 2, 3, 4));
	
	/*
	3. Create a class named Student with a few fields such as studentId, name, and address. Should these fields be static or non-static? Add the main method to this class and access the fields from the main method. 
	*/
	print("\nExercise 3, running Student.main method from Test.java: ");
	Student.main();
	
	/*
	4. Add a static field to Student class. Access this field from another class. Use appropriate import statement to access the field directly. Change accessibility of the field and see its impact on the code that tries to access it. 
	*/
	print("\nExercise 4, print static field from other class: ");
	print("Student.school = "+ school);
	
	/*
	5. Create a method named method1 in TestClass that accepts a Student object and updates the static as well as instance fields of this object. Pass the same Student object to another method named method2 and print the values. Assign a new Student object to the Student variable of method2 and set its fields to different values. After returning back to method1, print the values again. Explain the output. 
	*/
	print("\nExercise 5, passing Students: ");
	Student s = new Student();
	
	print("Updating values of student with method1");
	method1(s);
	
	print("Printing values by method2: ");
	method2(s);
	
	print("Assinging new student variable: ");
	s = new Student();
	
	print("Updating values of student manually");
	s.name = "Bas";
	s.studentId = "123";
	
	print("Printing updated values: ");
	method2(s);
	
	/*
	6. Add a constructor in Student class that accepts values for all of its instance fields. Add a no-args constructor in Student class that makes use of the first constructor to set all its instance fields to dummy values. 
	*/
	print("\nExercise 6, constructors: ");
	s = new Student();
	print("New student, with default values created.");
	
	/*
	7. Create a class named Course in different package. Add a static method named enroll in this class that accepts a Student. Use different access modifiers for fields of Student class and try to access them from the enroll method.
	*/
	print("\nExercise 7, enroll student: ");
	Course.enroll(s);
	
	}
	
	/*
	1. Create a method named add that can accept any number of int values and returns the sum of those values. 
	*/
	static int add(int... ia){
		int sum = 0;
		for (int i : ia){
			sum+=i;
		}
		return sum;
	}
	
	/*
	2. Create another method named add in the same class that can accept any number of int values but returns a String containing concatenation of all those values. What can you do to resolve compilation error due to the presence of the two methods with same signature? Invoke these methods from the main method of this class. 
	*/
	
	static String addS(int... ia){
		String conc = "";
		for (int i : ia){
			conc+=i;
		}
		return conc;
	}
	
	/*
	5. Create a method named method1 in TestClass that accepts a Student object and updates the static as well as instance fields of this object. Pass the same Student object to another method named method2 and print the values. Assign a new Student object to the Student variable of method2 and set its fields to different values. After returning back to method1, print the values again. Explain the output. 
	*/
	
	static void method1(Student s){
		s.studentId = "0"+ s.studentId;
		s.name = "Ben";
		s.adress = "Summer street 123";
		Student.school = "ABCD";
	}
	
	static void method2(Student s){
		print("studentID: "+s.studentId);
		print("name : "+s.name);
		print("adress : "+s.adress);
		print("school : "+Student.school);
	}
	
	static void print(String s){
		System.out.println(s);
	}
}











