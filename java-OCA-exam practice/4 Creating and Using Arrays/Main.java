import static java.lang.System.out;

class Main{
	private String test;
	public static void main(String[] arg){
		Main m = new Main();
		System.out.println(m.test);
		/*
		1. Create a array of booleans of length 3 inside the main method. Print the elements of the array without initializing the array elements explicitly. Observe the output. 
		*/
		boolean[] boArray = new boolean[3];
		out.println("Excercise 1: ");
		for(boolean b : boArray){
			System.out.print(b + "\n");
		}
		out.println();
		/*
		2. Given int[] first = new int[ 3];, int[] second = {};, and int[] third = null;, print out the length of the three arrays and print out every element of the three arrays. 
		*/
		int[] first = new int[ 3];
		int[] second = {};
		int[] third = null;
		out.println("Excercise 2: ");
		out.print("first, length: " + first.length + ", elements: ");
		out.print(first[0] + ", ");
		out.print(first[1] + ", ");
		out.println(first[2] );
		out.println("second (empty array): " + second);
		out.println("third (no array assignment): " + third + "\n");
		
		/*
		3. Create an array of chars containing four values. Write assignment statements involving the array such that the first element of the array will contain the value of the second element, second element will have the value that was there in the third element. and third element will contain the value of the fourth element. 
		*/
		
		char charar[] = {'a', 'b', 'c', 'd'};
		char temp = charar[charar.length-1];
		out.println("Excercise 3:");
		for(int i = charar.length - 1; i>-1;i--){
			if(i>0) {
				out.println("Changing char nr "+ i + "(" + charar[i]+") to " + charar[i-1]);
				charar[i] = charar[i-1];
			} else {
				out.println("Changing char nr "+ i + "(" + charar[i]+") to " + temp);
				charar[i] = temp;
			}
		}
		out.println(charar + " oops.. wrong order..");
		
		
		while(charar[0]!='b'){
			out.println("First element is now " + charar[0] + ". Reordering array..");
			temp = charar[0];
			for(int i = 0; i<charar.length;i++){
				if(i!=charar.length-1) {
					out.print("Changing char nr "+ i + "(" + charar[i]+") to " + (charar[i] = charar[i+1]));
					out.println(". Char nr " + i + " is now '" + charar[i] + "'.");
				} else {
					out.print("Changing char nr "+ i + "(" + charar[i]+") to " + (charar[i] = temp));
					out.println(". Char nr " + i + " is now '" + charar[i] + "'.");
				}
			}
		}
		out.print("Corrected to: ");
		out.println(charar + "\n");
		
		
		/*
		4. Declare and initialize an array of length 4 of type array of Strings without using the new keyword such that no two arrays of Strings have the same length. Print the length of all of the arrays one by one (including the length of the two dimensional array).
		*/
		out.println("Excercise 4:");
		//String arS[][] = new String[1][4];
		String arS[][] = {{"abc"},{"def","ghi"},{"jkl", "mno", "pqr"}, {"stu","vwx","yz","abc"}};
		for(int i=0;i<arS.length;i++){
			out.println("Inner array element nr "+ i +" is of length " +arS[i].length);
			for(int j=0;j<arS[i].length;j++){
				//out.println("Printing vaule in arS["+i+"]["+j+"]: "+ arS[i][j]);
			}
		}
		out.println("Done printing inner array lengths. Outer array is of length "+arS.length + "\n");
		
		/*
		5. Given the statement String[][] names = new String[ 2][ 3]; How many Strings will you need to fill up names completely? Initialize each element of names with a non-null String. Print each of those values one by one without using a loop. Do the same using nested for loops after going through the chapter on loops. 
		*/
		//6 names
		out.println("Excercise 5:");
		String[][] names = new String[ 2][ 3];
		names[0][0] = "Bob";
		names[0][1] = "Bill";
		names[0][2] = "John";
		names[1][0] = "Dan";
		names[1][1] = "Eric";
		names[1][2] = "Rick";
		
		for(int i = 0;i<names.length*names[0].length;i++){
			String tempname;
			switch(i){
				case 0: 
				case 1:
				case 2:	 tempname = names[0][i];break;
				default: tempname = names[1][i-3]; 
			}
			out.println("Printing name 1 by 1: " + tempname);		
		}
		
		for(int i = 0;i<names.length;i++){
			for(int j = 0;j<names[0].length;j++){
				out.println("Printing name from nested for loop: "+ names[i][j]);		
			}
		}
		
		for(String[] a: names){
			for(String s: a){
				out.println("Printing name from enhanced for loop: "+ s);
			}
		}
		
		/*
		6. Define two variables of type array of Strings. Initialize them using the elements of the array created in the previous exercise. 
		*/
		
		String[] names1 = {names[0][0], names[0][1],names[0][2]};
		String[] names2 = {names[1][0], names[1][1],names[1][2]};
				
			
		/*
		7. Define a simple class named Data with a public instance field named value of type int. Create and initialize a Data variable named d in TestClass's main. Create an array of Data of length 3 and initialize each of its elements with the same Data instance. Use any of the array elements to update the value field of the Data object. Print out the value field of the Data object using the three elements of the array. Finally, print the value field of the original Data using the variable d. 
		*/
		
		out.println("\nExcercise 7: ");	
		Data d = new Data();
		System.out.println("Declared and initialized Data object. Value of object = " + d.value);
		
		Data da[] = {d, d, d};
		System.out.println("Declared and initialized array of size 3 with same Data object");
		
		da[0].value +=1;
		
		System.out.println("Array object 1 value field is "+da[0].value);
		System.out.println("Array object 2 value field is "+da[1].value);
		System.out.println("Array object 3 value field is "+da[2].value);
		System.out.println("Updated Data value to value "+ d.value);		
		
		/*
		8. Define and initialize an array of array of ints that resembles a triangular matrix of integers. 
		*/
		out.println("\nExcercise 8: ");	
		int[][] tri = {{1},{2,3},{4,5,6},{8,9,10,11}};
		out.println("Triangular array object: " + tri);

		/*
		9. Declare another array of array of ints and initialize it using the elements of the array created in the previous exercise in such a way that it resembles an inverted triangular matrix of integers. 
		*/
		out.println("\nExcercise 9: ");
		int[][] irt = {tri[3],tri[2],tri[1],tri[0]};
		out.println("Same array reversed: " + irt);
		
		/*
		10. Declare and initialize a variable of type array of Objects of length 3. Initialize the first element of this array with an array of ints, second with an array of array of ints, and third with an array of Objects. See if any of the assignments fails compilation. 
		*/
		out.println("\nExcercise 10: ");
		Object[] oa = new Object[3];
		oa[0] = new int[3];
		oa[1] = new Integer[3];
		oa[2] = new Object[3];
		out.println("Declared Object[] with new Object[3] and each element being an seperate array.\n"+
		"Works as long as Object array is 1 dimensional: array is an object, thus\n"+
		"it can be stored in an object array. When declared as 2D fe Object[][] an \n" + 
		"Object array is expected, where an array of primitives (ints) does not meet\b"+
		"that requirement.");

		/*
		11. Given the statement int[][] nums = new int[ 1][ 3];, how many int values can nums store? Write down how each element of nums can be addressed. 
		*/
		out.println("\nExcercise 11: \n 1 * 3 = max 3 elements. \nnums[0][0], nums[0][1] and nums[0[2].");
		
		/*
		Given the following code:
		Execute it mentally and write down its output on paper. Run the code and check your answer.
		*/
		out.println("\nExcercise 12:\nResult should be: \n"+
		"\n0 0 0 = 0"+
		"\n0 0 1 = 1"+
		"\n0 1 0 = 1"+
		"\n0 1 1 = 2"+
		"\n0 2 0 = 2"+
		"\n0 2 1 = 3"+
		"\n0 3 0 = 3"+
		"\n0 3 1 = 4");
		
		int[][][] nums = new int[ 1][ 4][ 2]; 
		for(int i = 0; i < nums.length; i++){ 
			for( int j = 0; j < nums[ i]. length; j++){ 
				for( int k = 0; k < nums[ i][ j]. length; k++){ 
					nums[ i][ j][ k] = i + j + k; 
					System.out.println(" num[" + i +"][" + j +"][" + k +"] = "+ nums[ i][ j][ k]); 
				}
			}
		}

		
		
	}
	
	
}
		