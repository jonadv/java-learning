import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
public class Test{
	public static void main(String[] arg){
/*
1. Initialize a triangular matrix of ints using a for loop such the each element contains an value equal to the sum of its row and column index. Do the same using a while loop. 
*/
		out.println("/nExercise 1a, triangular in matrix by for loop: ");
		int i=0,j=0,k=0;
		int [][] ia = new int[5][];
		for(i = 0; i < ia.length;i++){
			int iaa[] = new int[i+1];
			ia[i] = iaa;
			for(j =0;j<ia[i].length;j++){
				ia[i][j] = i + j;
				//out.print(" ia[i][j]= ia["+i+"]["+j+"] = "+ia[i][j]);
				out.print(ia[i][j]);
			}
			out.println();
		}
		
		out.println("/nExercise 1b, triangular in matrix by while loop: ");
		ia = new int[5][]; i=0; j=0;
		while(i<ia.length){
			ia[i]= new int[i+1];
			while(j<ia[i].length){
				ia[i][j] = i + j;
				//out.print(" ia[i][j]= ia["+i+"]["+j+"] = "+ia[i][j]);
				out.print(ia[i][j]);
				j++;
			}
			out.println();
			i++;
			j=0;
		}
		
		/*
		2. Write a method that determines whether a given number N is a prime number or not by dividing that number with all the numbers from 2 to N/2 and checking the remainder. 
		*/
		try{
			i = Integer.parseInt(arg[0]);
			out.println("\nExercise 2, check if inputnr "+i+" is prime");
		}catch(Exception e){
			i = 31;
			out.println("\nExercise 2, check if nr "+i+" is prime");
		}
		isPrime(i, true, true);
		
		/*
		3. Use nested for loops to print a list of prime numbers from 2 to N. 
		*/
		try{
			i = Integer.parseInt(arg[0]);
			out.println("\nExercise 3, print primes from 2 till inputnr "+i);
		}catch(Exception e){
			i = 20;
			out.println("\nExercise 3, print primes from 2 till "+i);
		}
		List<Integer> al = new ArrayList<>();
		for(j=0;j<=i;j++){
			if(isPrime(j, false, false)) al.add(j);
		}
		out.println(al);
		
		/*
		4. Use nested for loops to print out each element of the array referred to by _3D in the format [i][ j][ k] = N: 

		int[] _1D1 = new int[]{1, 2, 3};
		int[][] _2D1 = new int[][]{_1D1};
		int[][] _2D2 = new int[][]{_1D1, _1D1};
		int[][][] _3D = new int[][][]{_2D1, _2D2};
		*/
		
		out.println("\nExercise 4: ");
		int[] _1D1 = new int[]{1, 2, 3};
		int[][] _2D1 = new int[][]{_1D1};
		int[][] _2D2 = new int[][]{_1D1, _1D1};
		int[][][] _3D = new int[][][]{_2D1, _2D2};
		
		for(i = 0;i<_3D.length;i++){
			for(j = 0;j<_3D[i].length;j++){
				for(k = 0;k<_3D[i][j].length;k++){
					out.println("[i][j][k] = N -> ["+i+"]["+j+"]["+k+"] = "+_3D[i][j][k]);
				}
			}
		}
		
		/*
		5. Write a method that accepts a String as input and count the number of spaces in the string from start to until it finds an 'x', or if there is no 'x' in the string, till end. 
		*/
		
		out.println("\nExercise 5, count spaces till first x: ");
		String strTestX = arg.length > 0 ? arg[0] : "until it finds an 'x'";
		out.println("Test with string: "+ strTestX);
		out.println(strTestX+" --> " + countSpacesTillX(strTestX));
		
		/*
		6a. The following code contains a mistake that is quite common while using nested for loops. Identify the problem, fix it and print out all the elements of chars array.
		6b. What will happen if char[0] is initialized as new String[1] instead of new String[2]? 
		*/
		out.println("\nExercise 6: ");
		out.println("a. innerloop condition check refers to outer array. chars[c].length");
		String[][] chars = new String[2][];
		chars[0] = new String[2];
		chars[1] = new String[4];
		char cha = 97;
		for (char c = 0; c < chars.length; c++) {
			for (char ch = 0; ch < chars[c].length; ch++) {
				chars[c][ch] = "" + cha;
				cha++;
				out.println("chars["+(int)c+"]["+(int)ch+"]= "+chars[c][ch]);
			}
		}

		/*
		7. To avoid the possibility of inadvertently introducing the mistake shown in the above code, a programmer decided to use for-each loops instead of the regular for loops: Is this a good idea?  
		*/
		out.println("\nExercise 7: /n Yes, good idea. Much more clear.");
		for( String[] chara : chars){
			for( String s : chara){
				s = "" + cha; 
				cha++; 
				out.println(cha);
			} 
		} 
		
		/*
		8. Use an enhanced for loop to print alternate elements of an array. Can you use an enhanced for loop to print the elements in reverse order? 
		*/
		out.println("\nExercise 8, alternate elements with enhanced array.");
		i = 0;
		for(int z : ia[ia.length-1]){
			if(i%2==0) out.println("Printing alternate: "+z);
			i++;
		}
		out.println("Printing reverse order is not possible with enhanced for loop.");
		
		/*
		9. Given two arrays of same length and type, copy the elements of the first array into another in reverse order.
		*/
		Object oa[] = {1, 2, 3, 4, 5, 6, 7, 8};
		j = oa.length;
		Object oa_rev[] = new Object[j];
		for(i=0;i<j;i++){
			oa_rev[i] = oa[j-1-i];
		}
		
		out.println("\nExercise 9, reverse order:");
		for(i=0 ; i<oa.length;i++){
			out.println("original: "+ oa[i]+", reversed: "+oa_rev[i]);
		}
	}

	/*
	2. Write a method that determines whether a given number N is a prime number or not by dividing that number with all the numbers from 2 to N/2 and checking the remainder. 
	*/

	public static boolean isPrime(int N, boolean printChecks, boolean printResult){
		boolean remainderFound = false, isP = false;
		for(int i = 2; i < N/2;i++){
			if(printChecks) out.println("checking remainder of "+i);
			if(N%i==0){	
				if(printChecks) out.println("found remainder with "+i);
				remainderFound = true;
				break;
			}
		}
		if(printChecks && !remainderFound) out.println("no remainder found");
		
		isP = (!remainderFound && N>1);
		if(printResult) out.println(N+" is "+(isP?"":"not ")+"a prime number");
		return isP;
	}
	
	/*
	5. Write a method that accepts a String as input and count the number of spaces in the string from start to until it finds an 'x', or if there is no 'x' in the string, till end. 
	*/
	public static int countSpacesTillX(String s){
		int i = 0, spaces = 0;
		forloop:
		for(i = 0; i<s.length();i++){
			switch(s.charAt(i)){
				case 'x': break forloop;
				case ' ': spaces+=1; break;
			}
		}
		return spaces;
	}
	
	
}


















