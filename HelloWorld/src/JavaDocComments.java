
public class JavaDocComments {
	/**
	  * This method returns the product of two integers.
	  *
	  * @param numOne  The first integer
	  * @param numTwo  The second integer
	  * @return  The product of the two integers
	  */
	 private static int product(int numOne, int numTwo)
	 {
	    return numOne * numTwo;
	 }

	 /**
	  * This method returns an array with each word from a string in it.
	  *
	  * @param   input  The string we want to split.
	  * @return  The new string array.
	  */
	  private static String[] split(String input)
	  {
	    return input.split("\\s+");
	  }
	  
	  public static void main(String[] args) {
		    String [] spString = split("Hello World!!!");
			System.out.println("String 1 : " + spString[0] + " String 2 : " + spString[1]);
			System.out.println(product(5,5));
		}
	  
}
