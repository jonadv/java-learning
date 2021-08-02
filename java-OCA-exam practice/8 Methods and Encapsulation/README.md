Exercises 
Chapter 8 Working with Methods and Encapsulation

1. Create a method named add that can accept any number of int values and returns the sum of those values. 

2. Create another method named add in the same class that can accept any number of int values but returns a String containing concatenation of all those values. What can you do to resolve compilation error due to the presence of the two methods with same signature? Invoke these methods from the main method of this class. 

3. Create a class named Student with a few fields such as studentId, name, and address. Should these fields be static or non-static? Add the main method to this class and access the fields from the main method. 

4. Add a static field to Student class. Access this field from another class. Use appropriate import statement to access the field directly. Change accessibility of the field and see its impact on the code that tries to access it. 

5. Create a method named method1 in TestClass that accepts a Student object and updates the static as well as instance fields of this object. Pass the same Student object to another method named method2 and print the values. Assign a new Student object to the Student variable of method2 and set its fields to different values. After returning back to method1, print the values again. Explain the output. 

6. Add a constructor in Student class that accepts values for all of its instance fields. Add a no-args constructor in Student class that makes use of the first constructor to set all its instance fields to dummy values. 

7. Create a class named Course in different package. Add a static method named enroll in this class that accepts a Student. Use different access modifiers for fields of Student class and try to access them from the enroll method.

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 230). Enthuware. Kindle Edition. 