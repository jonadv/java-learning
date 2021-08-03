Exercises chapter 11 Working with Enheritance 2

1. Given the following two classes:
	public class TestClass {
	  public static void main(String[] args) {
		Document d = new PdfDocument();
		System.out.println(d.getType()); // should print "pdf" 
	  }
	}
	class Document {
	  private String type = "dummy";
	  private byte[] data; // insert appropriate getters and setters 
	}
The above code refers to a class named PdfDocument. Write code for this class such that TestClass will print "pdf" when executed. 

2. Given the following code:
	class Radio {
	  private double frequency = 1.1; // insert appropriate getter and setter 
	}
	class TV {
	  private int channel = 5; // insert appropriate getter and setter 
	}
	public class TestClass {
	  public static void main(String[] args) {
		TV t = new TV();
		Radio r = new Radio();
		reset(t);
		reset(r);
		System.out.println(r.getFrequency()); // should print 0.0 
		System.out.println(t.getChannel()); // should print 0 
	  }
	}
Write code for the reset method in TestClass such that TestClass will print 0.0 and 0 when executed. 

3. You are expected to reset several electronic devices in future. Refactor the code given above such that TestClass's reset method is able to reset any new device without requiring any change in the method code. 

4. Given the following code:
	class Pie {
	  public void makePie() {
		System.out.println("making pie");
	  }
	}
Create two classes PumpkinPie and ApplePie that extend Pie. Override the makePie method in these classes. Ensure that the overridden method is also invoked whenever makePie is invoked on objects of these classes.

5. Add a static method named getCalories in Pie: 
	public static int getCalories() {
	  return 100;
	}
Create a new class named Nutritionist with a method named printCalories. This method should take any kind of Pie and print the correct number of calories as applicable for the given kind of Pie.

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

7. Create a class named TransformerFactory with a method named getTransformer. This method should return different types of transformers based on an argument. Use this factory class to get different types of transformers and invoke the transform method on them.

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 326). Enthuware. Kindle Edition. 