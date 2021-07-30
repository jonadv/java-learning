/*
Define a local variable in a method. Update this 
variable in a while loop and print it out after
the while loop ends. Check what happens when you 
define a variable by the same name within the 
while loop.
*/

public class ExcTwo{
	public static void main(String[] args){
		int i = 0;
		int j = 3;
		while(i<j){
//			int i = 5; //does not compile, variable already exists
			i++;
		}
		System.out.print("Printing local variable: " + i );
	}
}
