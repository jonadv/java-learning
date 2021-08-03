/*
1. Create a class that implements the following interface with appropriate implementation for the methods of the interface:

	interface StringComparator {
		boolean compare(String s, StringBuilder sb);
		boolean compare(int ivalue, String svalue);
		boolean compareSpecial(String s1, String s2); 
		// this method must compare the two string arguments while ignoring white spaces at the beginning or at the end of the strings. For example, it must true if the arguments are " hello" and "hello ". 
		
		boolean checkString(String s); 
		// this method must return true if the argument contains no character. Show at least three ways to implement this method 
	}
*/

class Test implements StringComparator{
	public static void main(String... arg){
		dbg("Exercise 1: ");
		Test t = new Test();
		String s1 = new String("abc");
		String s2 = new String("abc");
		StringBuilder sb = new StringBuilder("abc");

		String s3 = new String("1");	
		dbg("Compare String vs StringBuilder abc: "+ t.compare(s1, sb));
		dbg("Compare int vs String 1: "+ t.compare(1, s3));
		dbg("Compare String vs String trimmed abc: "+ t.compareSpecial(s1, s2+" "));
		
		String se = new String("");
		dbg("Check String by isEmpty: "+t.checkString(se));
		dbg("Check String by byLength: "+t.checkStringByLength(se));
		dbg("Check String by byComparison: "+t.checkStringByComparison(se));

		dbg("\nExercise 2: ");
		dbg("ObjectsToStringReturnsInternalString: "+ ObjectsToStringReturnsInternalString(new Object()));
		dbg("SBtoStringReturnsInternalString: "+ SBtoStringReturnsInternalString(sb));
		dbg("SBsubstringReturnsInternalString: "+SBsubstringReturnsInternalString(sb));
		
		dbg("\nExercise 3: ");
		dbg("Masking first characters of 123456789: "+maskLast("123456789"));
		dbg("Masking last characters of 123456789:  "+maskFirst("123456789"));
		dbg("Masking first characters of 123456789123456789: "+maskLast("123456789123456789"));
		dbg("Masking last characters of 123456789123456789:  "+maskFirst("123456789123456789"));
		
		dbg("\nExercise 4: ");
		dbg("Masking last characters of '123': "+maskFirst("123"));
		dbg("Masking last characters of '"+"': "+maskFirst(""));
		String snull = null;
		dbg("Masking last characters of null: "+maskFirst(snull));
		
		dbg("\nExercise 5: ");
		dbg("Masking first StringBuilder string 12345: "+maskFirst(new StringBuilder("12345")));
		dbg("Masking last StringBuilder string 12345:  "+maskLast(new StringBuilder("12345")));
		
		dbg("\nExercise 6: ");
		dbg("Concat 'abc'+ null + '': "+concat("abc", null, ""));

	}
	public boolean compare(String s, StringBuilder sb){
		return s.intern() == sb.toString().intern();
	}
	public boolean compare(int ivalue, String svalue){
		return new String(ivalue+"").intern() == svalue.intern();
	}
	public boolean compareSpecial(String s1, String s2){
		return s1.trim().intern() == s2.trim().intern();
	};
	public boolean checkString(String s){
		return s.isEmpty();
	}
	public boolean checkStringByLength(String s){
		return s.length() == 0;
	}
	public boolean checkStringByComparison(String s){
		return compareSpecial(s, "");
	}
	
	/*
	2. Write code to determine whether the toString and substring methods of StringBuilder and String classes return an interned string or not. Confirm your results by checking the JavaDoc API descriptions of these methods. 
	*/
	static boolean ObjectsToStringReturnsInternalString(Object o){
		return o.toString().intern() == o.toString();
	}
	static boolean SBtoStringReturnsInternalString(StringBuilder sb){
		return sb.toString().intern() == sb.toString();
	}
	static boolean SBsubstringReturnsInternalString(StringBuilder sb){
		return sb.substring(0, sb.length()-1) == sb.substring(0, sb.length()-1).intern();
	}
	
	/*
	3. Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is "12345678", the return value should be "XXXX5678". 
	
	4. Implement exception handling in the above method such that the method will not end up with an exception if the input string is null or of size less than 4. 
	*/
	static String maskFirst(String s){
		if(s == null) return "";
		
		int len = s.length();
		int left = len < 5 ? len : 0;
		if(s.length()<5) return s; //new String(new char[s.length()]).replace("\0", "X");
		String X = new String(new char[s.length()-4]).replace("\0", "X"); 
		return X + s.substring(s.length()-4, s.length());
	}
	static String maskLast(String s){
		return s.substring(0, s.length()-4) + "XXXX";
	}
	
	/*
	5. Implement the same method as above but with a StringBuilder as the input parameter. 
	*/
	static String maskFirst(StringBuilder s){
		return maskFirst(s.toString());
	}
	static String maskLast(StringBuilder s){
		return maskLast(s.toString());
	}
	
	/*
	6. Write a method that takes a String[] as an argument and returns a String containing the concatenation of all the strings in the input array. Invoke your method with different arguments. Make sure that your code handles the cases where the argument is null, contains a few nulls, or contains only nulls. Is this a good place to make use of a StringBuilder? 
	*/
	static String concat(String... sa){
		StringBuilder sb = new StringBuilder(0);
		for(String s: sa){
			sb.append(s);
		}
		return sb.toString();
	}
	
	static void dbg(String s){
		System.out.println(s);
	}
	static void dbg(boolean b){
		System.out.println(b+"");
	}
}

interface StringComparator {
	boolean compare(String s, StringBuilder sb);
	boolean compare(int ivalue, String svalue);
	boolean compareSpecial(String s1, String s2); 
	// this method must compare the two string arguments while ignoring white spaces at the beginning or at the end of the strings. For example, it must true if the arguments are " hello" and "hello ". 
	
	boolean checkString(String s); 
	// this method must return true if the argument contains no character. Show at least three ways to implement this method 
}