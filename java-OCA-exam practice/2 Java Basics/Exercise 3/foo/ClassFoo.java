package foo;

import foo.bar.ClassBar;
//import foo.bar.*;
//import foo.*; //doesnt import bar.ClassBar

public class ClassFoo{
	public static void main(String[] arg){
		System.out.println("Printing static method from foo.bar package");
		System.out.println(ClassBar.statMethod()); //requires import
//		System.out.println(foo.bar.ClassBar.statMethod()); //no import needed
	}
}
