

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Test{
	public static void main(String... arg){
		dbg("Exercise 14");
		TesterAnything ta = () -> true;
		CompareInt ci = k -> k>5;
		dbg("TesterAnything with method ta.test() returns: "+ta.test());
		dbg("CompareInt with method ci.test(10) returns: "+ci.test(10));
		
		dbg("\nExercise 15");
		Shape area = () -> 10*10;
		Operation op = (s, d)-> {
			dbg("Printing from Operation op: " + s);
			dbg("d[0] x d[1] = "+(d[0] * d[1]));
		};
		
		dbg("Shape area returns: "+area.computeArea());
		dbg("Operation op call with operate('Hello', new double[]{3.0, 5.0})...");
		op.operate("Hello", new double[]{3.0, 5.0});
		
		dbg("\nExercise 16");
		List<Image> li = new ArrayList<>();
		Image i1 = new Image(30, 150); li.add(i1);
		Image i2 = new Image(140, 300); li.add(i2);
		Image i3 = new Image(89, 93); li.add(i3);
		Image i4 = new Image(1280, 1080); li.add(i4);
		Image i5 = new Image(50, 50); li.add(i5);
		Predicate<Image> pID = (img) -> img.id>2;
		dbg("List unfiltered: "+li);
		dbg("List filtered (ID>2): "+Image.filter(li, pID));
		
		Predicate<Image> pSize = (img) -> img.width > 100 && img.height > 100;
		dbg("\nExercise 17");
		dbg("List unfiltered: "+li);
		dbg("List filtered (size>100x100): "+Image.filter(li, pSize));
		
	}
	
	
	static void dbg(String s){
		System.out.println(s);
	}
	static void dbg(Object o){
		dbg(o.toString());
	}
}

/*
14. Given the following lambda expressions, define appropriate interfaces that can be implemented using these lambda expressions.
	() -> true
	k -> k>5
*/

interface TesterAnything{
	boolean test();
}
interface CompareInt{
	boolean test(int i);
}

/*
15. Given the following interfaces, create lambda expressions that can be used to capture these interfaces.
	interface Shape {
		double computeArea();
	}
	interface Operation {
		void operate(String name, double[] params);
	}
*/
interface Shape {
	double computeArea();
}
interface Operation {
	void operate(String name, double[] params);
}

/*
16. Write a method that takes a list of Image objects and a Predicate as arguments, and returns another list containing only those Images that satisfy the predicate. 
*/

/*
17. Assuming that the Image class has width and height properties, invoke the above method that filters out images that are smaller than 100 x 100.
*/
class Image{
	int id;
	static int count;
	int width;
	int height;
	Image(){
		width = 0;
		height = 0;
		count++;
		id = count;
	}
	Image(int width, int height){
		this();
		this.width = width;
		this.height = height;
	}
	
	static List<Image> filter(List<Image> li, Predicate<Image> p){
        ArrayList<Image> imgToReturn = new ArrayList <>();
        for(Image i : li){
            if(p.test(i))
                imgToReturn.add(i);
        }
        return imgToReturn;
	}
	
	public String toString(){
		return "Image"+id+"("+width+"x"+height+")";
	}
}