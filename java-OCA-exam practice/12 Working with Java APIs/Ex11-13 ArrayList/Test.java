
import java.util.ArrayList;
import java.util.Arrays;

class Test{
	public static void main(String... arg){
		dbg("Exercise 11: ");
		String[] sa = {"ab", "cd", "ef", "ab"};
		dbg("String array of: "+sa+" converted to ArrayList: \n"+asArrayList(sa));
		
		dbg("\nExercise 12: ");
		dbg("String array of: "+sa+" converted to ArrayList (only uniques): \n"+asArrayListUniques(sa));
		
		dbg("\nExercise 13: ");
		dbg("Switching element 1 and 2: "+(switchAL(asArrayList(sa), 0,1)));
		
	}
	
	/*
	11. Create a method that takes an array of strings and returns an ArrayList containing the same strings.
	*/
	static ArrayList<String> asArrayList(String[] sa){
		return new ArrayList<String>(Arrays.asList(sa));
	}
	
	/*
	12. Update the above method to remove the duplicate elements from the ArrayList before returning. 
	*/
	static ArrayList<String> asArrayListUniques(String[] sa){
		ArrayList<String> out = new ArrayList<String>();
		for(String s: sa){
			if(!out.contains(s)) out.add(s);
		}
		return out;
	}
	
	/*
	13. Create a method with the signature switch(ArrayList al, int a, int b). This method should return the same list but after switching the elements at positions a and b. 
	*/
	static ArrayList<String> switchAL(ArrayList<String> al, int a, int b){
		String o1 = al.get(a);
		String o2 = al.get(b);
		al.set(a, o2);
		al.set(b, o1);
		return al;
	}
	
	static void dbg(String s){
		System.out.println(s);
	}
	static void dbg(Object o){
		dbg(o.toString());
	}
}
