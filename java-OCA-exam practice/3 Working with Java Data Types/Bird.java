class Bird{
	static int i = 0;
	static float f = 1.0f;
	double d = 0.0;
	boolean b = false;
	String s = "Bird";
	
/* 5. Add an instance variable of type Bird in Bird. Initialize this variable on the same line using "new Bird()" syntax. Instantiate a Bird object in TestClass's main and execute it. Observe the output. */

//	Bird bird = new Bird(); //causes stack overflow


/* 6. Remove the initialization part of the variable that you added to Bird in previous exercise. Initialize it with a new Bird object in TestClass's main. Identify how many Bird objects will be garbage collected when the main method ends. */

	public Bird bird ;
	
	void fly(){
		System.out.println("Printing Bird variables");
		System.out.println("i = " + i );
		System.out.println("f = " + f );
		System.out.println("d = " + d );
		System.out.println("b = " + b );
		System.out.println("s = " + s );
		System.out.println("Bird = " + b);
	}
	
	/*
	7. Add a parameter of type Float to Bird's fly method. Return an int value from fly by casting the method parameter to int. Invoke fly multiple times from TestClass's main by passing a float literal, a Float object, a double literal, an int, an Integer, and a String containing a float value. Observe which calls compile. 
	*/
	

	int flyFloat(Float F){	
		return (int) F.floatValue();
	}
}