Excercises Chapter 4 Creating and Using Arrays

1. Create a array of booleans of length 3 inside the main method. Print the elements of the array without initializing the array elements explicitly. Observe the output. 

2. Given int[] first = new int[ 3];, int[] second = {};, and int[] third = null;, print out the length of the three arrays and print out every element of the three arrays. 

3. Create an array of chars containing four values. Write assignment statements involving the array such that the first element of the array will contain the value of the second element, second element will have the value that was there in the third element. and third element will contain the value of the fourth element. 

4. Declare and initialize an array of length 4 of type array of Strings without using the new keyword such that no two arrays of Strings have the same length. Print the length of all of the arrays one by one (including the length of the two dimensional array).

5. Given the statement String[][] names = new String[ 2][ 3]; How many Strings will you need to fill up names completely? Initialize each element of names with a non-null String. Print each of those values one by one without using a loop. Do the same using nested for loops after going through the chapter on loops. 

6. Define two variables of type array of Strings. Initialize them using the elements of the array created in the previous exercise. 

7. Define a simple class named Data with a public instance field named value of type int. Create and initialize a Data variable named d in TestClass's main. Create an array of Data of length 3 and initialize each of its elements with the same Data instance. Use any of the array elements to update the value field of the Data object. Print out the value field of the Data object using the three elements of the array. Finally, print the value field of the original Data using the variable d. 

8. Define and initialize an array of array of ints that resembles a triangular matrix of integers. 

9. Declare another array of array of ints and initialize it using the elements of the array created in the previous exercise in such a way that it resembles an inverted triangular matrix of integers. 

10. Declare and initialize a variable of type array of Objects of length 3. Initialize the first element of this array with an array of ints, second with an array of array of ints, and third with an array of Objects. See if any of the assignments fails compilation. 

11. Given the statement int[][] nums = new int[ 1][ 3];, how many int values can nums store? Write down how each element of nums can be addressed. 

12. Given the following code:
int[][][] nums = new int[ 1][ 4][ 2]; 
for(int i = 0; i < nums.length; i + +){ 
	for( int j = 0; j < nums[ i]. length; j + +){ 
		for( int k = 0; k < nums[ i][ j]. length; k + +){ 
		nums[ i][ j][ k] = i + j + k; 
		System.out.println(" num[" + i +"][" + j +"][" + k +"] = "+ nums[ i][ j][ k]); 
		} 
	} 
} 
Execute it mentally and write down its output on paper. Run the code and check your answer.


Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 109). Enthuware. Kindle Edition. 