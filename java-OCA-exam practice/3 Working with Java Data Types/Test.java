/*
2. Create a TestClass that has a static variable of type Bird. Initialize this variable with a valid Bird object. Print out the default values of static and instance variables of Bird from the main method of TestClass. Also print out the static variable of TestClass from main. Observe the output.
*/

public class Test{
	static Bird b = new Bird();
	
	public static void main(String[] arg){
		/*
		System.out.println("2. Printing Bird variables");
		System.out.println("i = " + b.i );
		System.out.println("f = " + b.f );
		System.out.println("d = " + b.d );
		System.out.println("b = " + b.b );
		System.out.println("s = " + b.s );
		System.out.println("Bird = " + b);
		*/
		
		/*
		3. Create and initialize one more instance variable of type Bird in TestClass. Assign values to the members of the Bird instance pointed to by this instance variable in TestClass's main. Assign values to the members of first Bird using the second Bird. Print the values of the members of both the Bird objects.
		*/
		Bird c = new Bird();

		b.i = 100;
		b.s = "Big bird";

		c.i = b.i;
		c.s = b.s;
		
		System.out.println("3. Printing Bird variables");
		System.out.println("c.i = " + c.i + " b.i = " + b.i);
		System.out.println("c.s = " + c.s + " b.s = " + b.s);

		/* 
		4. Write code in fly method to print out the values of all members of Bird. Alter main method of TestClass to invoke fly on both the instance of Bird. Observe the values printed for static variables of Bird.
		*/
		
		System.out.println("4. c.fly:");
		c.fly();
		
		System.out.println("4. b.fly:");
		b.fly();

		/* 
		6. Remove the initialization part of the variable that you added to Bird in previous exercise. Initialize it with a new Bird object in TestClass's main. Identify how many Bird objects will be garbage collected when the main method ends. 
		*/
		
		b.bird = new Bird();
		//compile with command:
		//java -verbose Test
			
		/*
		7. Add a parameter of type Float to Bird's fly method. Return an int value from fly by casting the method parameter to int. Invoke fly multiple times from TestClass's main by passing a float literal, a Float object, a double literal, an int, an Integer, and a String containing a float value. Observe which calls compile. 
		
		8. Assign the return value of fly to an int variable, a float variable, a String variable, and boolean variable. Observe which assignments compile. Try the same assignments with an explicit cast. Print these variables out and observe the output.
		*/
		
		dbg("float literal: " + b.flyFloat(1.0f));
		dbg("Float object: " + b.flyFloat(Float.valueOf(1.0f)));
		dbg("double literal: " + b.flyFloat((float) 1.0));
		dbg("int : "+ b.flyFloat((float) 1));
		dbg("Integer object: " + b.flyFloat((float) (Integer.valueOf(1)).intValue()));
		dbg("String : " + b.flyFloat(Float.valueOf("1.0f")));

		
	}
	
	static void dbg(String s){
		System.out.println(s);
	}
	
}
