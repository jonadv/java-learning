Exercises Chapter 7 Using Loop Constructs

1. Initialize a triangular matrix of ints using a for loop such the each element contains an value equal to the sum of its row and column index. Do the same using a while loop. 

2. Write a method that determines whether a given number N is a prime number or not by dividing that number with all the numbers from 2 to N/ 2 and checking the remainder. 

3. Use nested for loops to print a list of prime numbers from 2 to N. 

4. Use nested for loops to print out each element of the array referred to by _3D in the format [i][ j][ k] = N: 

int[] _1D1 = new int[]{1, 2, 3};
int[][] _2D1 = new int[][]{_1D1};
int[][] _2D2 = new int[][]{_1D1, _1D1};
int[][][] _3D = new int[][][]{_2D1, _2D2};

5. Write a method that accepts a String as input and count the number of spaces in the string from start to until it finds an 'x', or if there is no 'x' in the string, till end. 

6. The following code contains a mistake that is quite common while using nested for loops. Identify the problem, fix it and print out all the elements of chars array.

	String[][] chars = new String[2][];
	chars[0] = new String[2];
	chars[1] = new String[4];
	char cha = 97;
	for (char c = 0; c < chars.length; c ++) {
		for (char ch = 0; ch < chars.length; ch++) {
			chars[c][ch] = "" + cha;cha++;
		}	
	}

What will happen if char[0] is initialized as new String[1] instead of new String[2]? 

7. To avoid the possibility of inadvertently introducing the mistake shown in the above code, a programmer decided to use for-each loops instead of the regular for loops: for( String[] chara : chars){ for( String s : chara){ s = "" + cha; cha + +; } } Is this a good idea? 

8. Use an enhanced for loop to print alternate elements of an array. Can you use an enhanced for loop to print the elements in reverse order? 

9. Given two arrays of same length and type, copy the elements of the first array into another in reverse order.

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (pp. 177-178). Enthuware. Kindle Edition. 		