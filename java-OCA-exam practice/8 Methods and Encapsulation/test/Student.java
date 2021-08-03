package test;
/*
3. Create a class named Student with a few fields such as studentId, name, and address. Should these fields be static or non-static? Add the main method to this class and access the fields from the main method. 
*/

public class Student{
	//fields should not be static
	public String studentId;
	public String name;
	public String adress;
	
	/*
	4. Add a static field to Student class. Access this field from another class. Use appropriate import statement to access the field directly. Change accessibility of the field and see its impact on the code that tries to access it. 
	*/
	static String school = "ABC";
	static int count = 0;
	
	/*
	6. Add a constructor in Student class that accepts values for all of its instance fields. Add a no-args constructor in Student class that makes use of the first constructor to set all its instance fields to dummy values. 
	*/
	Student(String studentId, String name, String adress){
		this.studentId = studentId;
		this.name = name;
		this.adress = adress;
	}
	
	Student(){
		this("000"+ (++count), "student", "street");
		System.out.println("New student created. Id of new student = "+studentId);
	}
	
	public static void main(String... arg){
		System.out.println("compile errors as field is instance field, not static: ");
		//System.out.print(this.name);
		//System.out.print(name);
		System.out.println ("Ok when called with instance: "+new Student().name);
		
	}
	
	
}