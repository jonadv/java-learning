package packTwo;

import packOne.ClassOne;
import packTwo.ClassTwo;

public class ClassThree{
	static int i;
	int j;
	public static void main(String[] arg){
		ClassOne c = new ClassOne();
		System.out.println("Static value from packOne ClassOne: " + ClassOne.i);
		System.out.println("Instance value from packOne ClassOne: " + c.i);
		ClassTwo c2= new ClassTwo();
		System.out.println("Static value from packOne ClassTwo: " + ClassTwo.i);
		System.out.println("Instance value from packOne ClassTwo: " + c2.i);
	}
}