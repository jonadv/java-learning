/*
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

*/
class Nutritionist{
	static void printCalories(Pie p){
		System.out.println("Calories of pie: "+p.getCalories());
	}
}
class Pie {
	public void makePie() {
		System.out.println("making pie");
	}
	public static int getCalories() {
		return 100;
	}
}
class ApplePie extends Pie{
	public void makePie() {
		System.out.println("making Apple pie");
	}
}

class PumpkinPie extends Pie{
	public void makePie() {
		System.out.println("making Pumpkin pie");
	}
}
		
	
public class TestClass {
	public static void main(String[] args) {
		ApplePie ap = new ApplePie();
		Nutritionist.printCalories(ap);
	}
}
	