/*
6. Given the following two classes:

	class XMLTransformer {
	  public String transform(String Data) {
		return "xmldata";
	  }
	}
	class NetworkTransformer {
	  public String transform(String Data) throws IOException {
		return "data from network";
	  }
	}
Refactor the two classes by adding an abstract super type named Transformer. 

*/

import java.io.IOException;

public class TestClass{
	public static void main(String... arg) throws IOException {
		System.out.println("Exercise 6.");
		System.out.println(new XMLTransformer().transform(""));
		System.out.println(new NetworkTransformer().transform(""));
		
		System.out.println("\nExercise 7.");
		System.out.println(TransformerFactory.getTransformer(true).transform(""));
		System.out.println(TransformerFactory.getTransformer(false).transform(""));
		;
	}
}

abstract class Transformer{
	public abstract String transform(String s) throws IOException;
}
class XMLTransformer extends Transformer{
	public String transform(String Data) {
		return "xmldata";
	}
}
class NetworkTransformer extends Transformer{
	public String transform(String Data) throws IOException {
		return "data from network";
	}
}

/*
7. Create a class named TransformerFactory with a method named getTransformer. This method should return different types of transformers based on an argument. Use this factory class to get different types of transformers and invoke transform method on them.
*/

class TransformerFactory{
	public static Transformer getTransformer(boolean b) throws IOException {
		Transformer t;
		if(b){	
			t = new XMLTransformer();
		}else{
			t = new NetworkTransformer();
		}
		return t;
	}
}


