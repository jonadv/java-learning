
public class Test{
	public static void main(String... arg){
		/*
		1. Create a method named countVowels that takes an array of characters as input and returns the number of vowels in the array. Furthermore, the method should throw a checked exception if the array contains the letter 'x'. 
		*/
		System.out.println("Exercise 1, countVowels method: ");
		char[] ca1 = {'a', 'b', 'a'};
		try{
			System.out.println("Testing char array {a,b,a}: "+ countVowels(ca1));
		}catch(Exception e){
			oops(e);
		}
		
		/*
		2. Invoke the countVowels method from main in a loop and print its return value for each command line argument. Observe what happens in the following situations: there is no command line argument, there are multiple arguments, there are multiple arguments but the first argument contains an 'x'. (Use String's toCharArray method to get an array of characters from the string.)
		
		3. Ensure that your main method prints the number of vowels in other command line arguments even if one argument contains an 'x'. 
		
		*/
		System.out.println("\nExercise 2 and 3, countVowels method: ");
		if(arg.length == 0) {
			System.out.println("No arguments to print");
		}else{
			for(String s: arg){
				try{
					System.out.println("Number of vowels for argument '"+s+"' = "+countVowels(s.toCharArray()));
				}catch(Exception e){
					oops(e);
				}
			}
		}

		System.out.println("\nExercise 4, passing null: ");
		char[] ca2 = null;
		try{
			System.out.println("Passing null... --> "+countVowels(ca2));
		}catch(Exception e){
			oops(e);
		}
		
		/*
		5. Modify countVowels method to throw an IllegalArgumentExcception if it is passed a null. 
		*/
		System.out.println("\nExercise 5, prevent illegal arguments: ");
		try{
			System.out.println("Passing null... --> "+countVowels(ca2));
		}catch(Exception e){
			oops(e);
		}
		
		/*
		6. Modify countVowels method to return -1, if the input array is null and 0, if the input array length is less than 10. Do not use an if statement.
		*/
		System.out.println("\nExercise 6, return -1 or 0: ");
		try{
			System.out.println("Passing null... --> "+countVowels(ca2));
		}catch(Exception e){
			oops(e);
		}
		try{
			System.out.println("Passing small array... --> "+countVowels(ca1));
		}catch(Exception e){
			oops(e);
		}	
	}
	
	/*
	1. Create a method named countVowels that takes an array of characters as input and returns the number of vowels in the array. Furthermore, the method should throw a checked exception if the array contains the letter 'x'. 
	*/
	static int countVowels(char[] ca) throws Exception{
		int count = 0;
		/*
		5. Modify countVowels method to throw an IllegalArgumentExcception if it is passed a null. 
		*/
		//if(ca == null) throw new IllegalArgumentException("Passed a null");
		
		/*
		6. Modify countVowels method to return -1, if the input array is null and 0, if the input array length is less than 10. Do not use an if statement.
		*/
		int length = 0;
		try{
			length = ca.length;
			switch((int)length/10){
				case 0: throw new IllegalArgumentException();
			}
		}catch(NullPointerException e){
			return count = -1;
		}catch(IllegalArgumentException e){
			return count = 0;
		}
		
		for(char c : ca){
			switch(c){
				case 'a': 
				case 'e': 
				case 'i': 
				case 'o':
				case 'u':
					count++;
					break;
				case 'x': 
					throw new Exception();
			}
		}
		return count;
	}
	static void oops(Exception e){
		System.out.println("Oops... --> "+e);
	}
}