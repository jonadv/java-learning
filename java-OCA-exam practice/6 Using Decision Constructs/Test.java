class Test{
	static boolean useIf;
	public static void main(String[] arg){
		System.out.println("Excercise 1: ");
		printOddorEven(Integer.parseInt(arg[0]));
		
		System.out.println("\nExcercise 2: ");
		printFallSum(Integer.parseInt(arg[0]));
		
		System.out.println("\nExcercise 3: ");
		excThree(654);
		
		System.out.println("\nExcercise 4: ");
	}
/*
1. Write a method that accepts a number as input and prints whether the number is odd or even using an if/else statement as well as a ternary expression. 
*/
	static void printOddorEven(int n){
		if(useIf){
			if(n%2 == 0){
				System.out.println("Test nr "+n+" by IF statement: Number is even");
			}else{
				System.out.println("Test nr "+n+" by IF statement: Number is not even");
			}
		}else{
			String s = n%2 == 0 ? "even" : "not even";
			System.out.println("Test nr "+n+" by ternary: Number is "+s);
		}
	}
/*
2. Accept a number between 0 to 5 as input and print the sum of numbers from 1 to the input number using code that exploits the "fall through" behavior of a switch statement. 
*/
	static void printFallSum(int i){
		if(i<0 || i >5){
			System.out.println("Inputnumber of "+ i +" is to small for fall through test.");
			return;
		}
		int x = 0;
		switch(i){
			case 1: x = x +1;
			case 2: x = x +2;
			case 3: x = x +3;
			case 4: x = x +4;
			case 5: x = x +5;
		}
		System.out.println("Inputnumber landed on case "+i+" and resulted to a sum of "+x);
		
	}
	
/*
3. Accept a number as input and generate output as follows using a cascaded and/ or nested if/ else statement - if the number is even print "even", if it is divisible by 3, print "three", if it is divisible by 5, print "five" and if it is not divisible by 2, 3, or 5, print "unknown". If the number is divisible by 2 as well as by 3, print "23", and if the number is divisible by 2, 3, and 5, print "235". 
*/
	static void excThree(int i){
		boolean t2 = i%2 ==0;
		boolean t3 = i%3 ==0;
		boolean t5 = i%3 ==0;
		int count = (t2?1:0) + (t3?1:0) + (t5?1:0);
		String s = "";
		if(count == 0){
			System.out.println( "Number "+i+" is not divisible by 2, 3 or 5.");
			return;
		}else if(count==1){
			if(t2){
				s = "even";
			} else if(t3){
				s = "three";
			} else { //if(t5)
				s = "five";
			}
		} else{ //count>1
			s = (t2?"2":"") + (t3?"3":"") + (t5?"5":"");
		}
		System.out.println("Number "+i+" is divisible and results in: "+s);
	}
	
/*
4. Indent the following code manually such that it reflects correct if - else associations. Use a plain text editor such as Notepad. Copy the code into a Java editor such Netbeans or Eclipse and format it using the editor's auto code formatting function. Compare your formatting with the editor's.
int a = 0, b = 0, c = 0, d = 0; 
boolean flag = false; 
if (a = = b) 
if (c = = 10) { 
if (d > a) { } 
else { } if (flag) 
System.out.println(""); 
else 
System.out.println(""); 
} else 
if 
(flag = = false)
System.out.println(""); 
else if (a + b < d) 
{ 
System.out.println(""); } 
else 
System.out.println(""); 
else d = b;
*/

	static void indentOwn(){
		int a = 0, b = 0, c = 0, d = 0; 
		boolean flag = false; 
		if (a = = b) 
			if (c = = 10) { 
				if (d > a) {
				} else { 
				} 
				if (flag) 
					System.out.println(""); 
				else 
					System.out.println(""); 
			} else if (flag = = false)
				System.out.println(""); 
		else if (a + b < d) { 	//err
				System.out.println(""); 
			} else 
				System.out.println(""); 
			else 				//err
				d = b;
	}
	
    static void indentNetBeansAuto() {
        int a = 0, b = 0, c = 0, d = 0;
        boolean flag = false;
        if (a == b) {
            if (c == 10) {
                if (d > a) {
                } else {
                }
                if (flag) {
                    System.out.println("");
                } else {
                    System.out.println("");
                }
            } else if (flag == false) {
                System.out.println("");
            } else if (a + b < d) {
                System.out.println("");
            } else {
                System.out.println("");
            }
        } else {
            d = b;
        }
    }

}