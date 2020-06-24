/*
 
Comments and javadoc 
Primitive Data types : int, boolean, double
Arithmetic Operators : + - * % -- ++
Relational Operators : <  <=  > >= <> ==
Boolean values : True False
Boolean operators : && || !
Print Statement : System.out.print
Escape Characters : \"  \n
Casting  : (int), (float), Double.parseDouble(s) Integer.parseInt(x)
Data Structures : Array, ArrayList, HashMap, 2D Array
array.length
Math functions : Math.sqrt() Math.PI 
String functions : compareTo, concatenation
Import Statement  like 
		import java.util.Arrays;
		import java.io.BufferedReader;
Reading from file
Quadratic Equation 
Loops : for, for each, while, do-while, break continue 
Objects
	Class, 
	Class Constructor, 
	instantiate a class, 
	extends, 
	abstract class, interfaces
 	public and private variables , 
    Setters and getters of private variables 
	toString() method this and super()
	function overriding
Static and final 
Exception handling try catch
 	nullPointerException 
 	arrayIndexOutOfBoundsException 
 	arithmeticException
Recursion 
Sorting - Bubble Insertion Selection Merge Quick 
Searching - Sequential Binary 
Threading
Swing 
Package 

0:19 variables
1:02 comments
1:17 operators
2:40 print statement
3:04 escape sequences
4:16 relational operators
4:57 logical operators
6:00 short circuit logical operators
6:59 casting
7:45 strings and concatenation
8:46 one dimensional arrays
10:48 two dimensional arrays
14:42 ArrayLists
20:22 import statements
20:46 Math class
21:45 control statements
24:30 while loops (repetition statement)
25:56 for loops (repetition statement)
27:37 for-each loop (repetition statement)
28:53 for loops cont. (Arrays)
30:41 for-each loops cont. (Arrays)
31:27 object orientation
32:27 default constructors
34:13 visibility modifiers
35:17 constructors with parameters
36:48 accessor methods
38:49 mutator methods
39:42 method visibility
40:03 method signatures
40:35 toString method
41:08 overriding
41:44 subclasses
45:31 subclass instantiation
47:25 abstract classes
47:41 abstract declaration/instantiation
49:08 interfaces
50:38 interface declaration/instantiation
51:31 variables cont. (Scope)
52:51 statics
54:04 final variables
54:33 overloading
55:24 javadoc comments
57:00 reference variable arrays
57:54 nullPointerException
58:18 arrayIndexOutOfBoundsException
58:41 arithmeticException
58:58 equals method
59:35 compareTo method




 */
public class Sylabus {

	public static void main (String[] args) {
		System.out.print("My Name is \"Swetha\" \n\n\n\n My School name is AVHS");
		int a = 10;
		double b = 20.0;
		b= (double) a;
		String s = "10.3";
		// b = (double) s; This is incorrect
		b = Double.parseDouble(s);

		String x = "19";
		a = Integer.parseInt(x);
		
		
		
	}
}
