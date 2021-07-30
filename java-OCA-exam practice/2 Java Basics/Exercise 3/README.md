Create a class in package foo and another class in package foo.bar with a static method. Invoke the static method from the class in package foo using different import statements.

command line commands used:

cd "C:\WorkFolderAS\GitHub\java-learning\java-OCA-exam practice\2 Java Basics\Exercise 3"
javac foo\bar\ClassBar.java
javac foo\ClassFoo.java
java foo.ClassFoo

prints:
Printing static method from foo.bar package
Return from statMethod