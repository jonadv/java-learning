Exercises chapter 10 Handling Exceptions

1. Create a method named countVowels that takes an array of characters as input and returns the number of vowels in the array. Furthermore, the method should throw a checked exception if the array contains the letter 'x'. 

2. Invoke the countVowels method from main in a loop and print its return value for each command line argument. Observe what happens in the following situations: there is no command line argument, there are multiple arguments, there are multiple arguments but the first argument contains an 'x'. (Use String's toCharArray method to get an array of characters from the string.) 

3. Ensure that your main method prints the number of vowels in other command line arguments even if one argument contains an 'x'. 

4. Pass null to the countVowels method and observe the output. 

5. Modify countVowels method to throw an IllegalArgumentExcception if it is passed a null. 

6. Modify countVowels method to return -1, if the input array is null and 0, if the input array length is less than 10. Do not use an if statement.

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 298). Enthuware. Kindle Edition. 