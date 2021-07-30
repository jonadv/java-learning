Excercises Chapter 5

1. Work out the values of the variables after each of the following statements on paper: 
String str = "7" + 5 + 10; 
str = 7 + 5 + "10"; 
str = "7" + (5 + 10); 
int m = 50;

int o = m--; 
int p = --o + m--; 
int x = m < n? n < o? o < p? p:o:n:m; 
int k = 4; 
boolean flag = k + + = = 5; 
flag = !flag; 

2. Which of the following lines will fail to compile and why? Write down the value of the variables after each line. 
byte b = 1;
 b = b < < 1; 
 int c = b < < 1; 
 byte d + = b; 
 byte e = 0; 
 e + = b; 
 
 3. What will the following code print and why? 
 String s = "a"; 
 String[] sa = { "a", s, s.substring( 0, 1), new String("a"), "" +'a' }; 
 for( int i = 0; i < sa.length; i + +)
 { 
 System.out.println( i); 
 System.out.println( s = = sa[ i]); 
 System.out.println( s.equals( sa[ i])); 
 }

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 138). Enthuware. Kindle Edition. 