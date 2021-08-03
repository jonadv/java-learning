Exercises Chapter 12 Working with Selected classes from the Java API

1. Create a class that implements the following interface with appropriate implementation for the methods of the interface:

	interface StringComparator {
		boolean compare(String s, StringBuilder sb);
		boolean compare(int ivalue, String svalue);
		boolean compareSpecial(String s1, String s2); 
		// this method must compare the two string arguments while ignoring white spaces at the beginning or at the end of the strings. For example, it must true if the arguments are " hello" and "hello ". 
		
		boolean checkString(String s); 
		// this method must return true if the argument contains no character. Show at least three ways to implement this method 
	}
2. Write code to determine whether the toString and substring methods of StringBuilder and String classes return an interned string or not. Confirm your results by checking the JavaDoc API descriptions of these methods. 

3. Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is "12345678", the return value should be "XXXX5678". 

4. Implement exception handling in the above method such that the method will not end up with an exception if the input string is null or of size less than 4. 

5. Implement the same method as above but with a StringBuilder as the input parameter. 

6. Write a method that takes a String[] as an argument and returns a String containing the concatenation of all the strings in the input array. Invoke your method with different arguments. Make sure that your code handles the cases where the argument is null, contains a few nulls, or contains only nulls. Is this a good place to make use of a StringBuilder? 

7. Assuming that system date is 1st July 2018, create LocalDate objects containing the same date using the of, now, and parse methods of LocalDate. Print the LocalDate objects so, created and observe the printed values. 

8. Create a method that takes a LocalDateTime as argument and returns a String containing just the date (without the time) in ISO format.

9. Pass the String returned by the method that you created above to another method that returns a LocalDate object representing the same date. 

10. Create a method that takes a List of LocalDateTime objects and returns a List of LocalDate objects containing only the dates having the same day and month as today. 

11. Create a method that takes an array of strings and returns an ArrayList containing the same strings.

12. Update the above method to remove the duplicate elements from the ArrayList before returning. 

13. Create a method with the signature switch( ArrayList al, int a, int b). This method should return the same list but after switching the elements at positions a and b. 

14. Given the following lambda expressions, define appropriate interfaces that can be implemented using these lambda expressions.
	() -> true
	k -> k>5
	
15. Given the following interfaces, create lambda expressions that can be used to capture these interfaces.
interface Shape {
	double computeArea();
}
interface Operation {
	void operate(String name, double[] params);
}

16. Write a method that takes a list of Image objects and a Predicate as arguments, and returns another list containing only those Images that satisfy the predicate. 

17. Assuming that the Image class has width and height properties, invoke the above method that filters out images that are smaller than 100 x 100.

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 378). Enthuware. Kindle Edition. 