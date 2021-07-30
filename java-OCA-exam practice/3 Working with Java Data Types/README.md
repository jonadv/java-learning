3.7 Exercises ☝ 

1. Define a reference type named Bird. Define an instance method named fly in Bird. Define a few instance as well as static variables of type int, float, double, boolean, and String in Bird. 

javac Test.java


2. Create a TestClass that has a static variable of type Bird. Initialize this variable with a valid Bird object. Print out the default values of static and instance variables of Bird from the main method of TestClass. Also print out the static variable of TestClass from main. Observe the output. 

javac Test.java
java Test

Printing Bird variables
i = 0
f = 1.0
d = 0.0
b = false
s = Bird
Bird = Bird@66133adc

3. Create and initialize one more instance variable of type Bird in TestClass. Assign values to the members of the Bird instance pointed to by this instance variable in TestClass's main. Assign values to the members of first Bird using the second Bird. Print the values of the members of both the Bird objects. 

4. Write code in fly method to print out the values of all members of Bird. Alter main method of TestClass to invoke fly on both the instance of Bird. Observe the values printed for static variables of Bird. 

5. Add an instance variable of type Bird in Bird. Initialize this variable on the same line using "new Bird()" syntax. Instantiate a Bird object in TestClass's main and execute it. Observe the output. 

6. Remove the initialization part of the variable that you added to Bird in previous exercise. Initialize it with a new Bird object in TestClass's main. Identify how many Bird objects will be garbage collected when the main method ends. 

7. Add a parameter of type Float to Bird's fly method. Return an int value from fly by casting the method parameter to int. Invoke fly multiple times from TestClass's main by passing a float literal, a Float object, a double literal, an int, an Integer, and a String containing a float value. Observe which calls compile. 

8. Assign the return value of fly to an int variable, a float variable, a String variable, and boolean variable. Observe which assignments compile. Try the same assignments with an explicit cast. Print these variables out and observe the output.
