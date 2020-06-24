
public class RecursionExample {
	
	// n! = n * (n-1) * (n-2) * (n-3)...*1
	private static int factorial(int n)
	{
	    int res = 1;
	    for(int i = n; i > 0; i--)
	    {
	        res *= i;
	    }
	    return res;
	}

	/*
		n! =  1           for n = 0
	       =  (n-1)! * n  for n > 0
    */
	
	private static int recfactorial(int n)
	{
	    // Basic cases
	    if(n == 0)
	    {
	        return 1;
	    }

	    // cases where n>1 with recursive method

	    return recfactorial(n - 1) * n;
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 0 = " + factorial(0));
		System.out.println("Factorial of 0 = " + recfactorial(0));

		System.out.println("Factorial of 1 = " + factorial(1));
		System.out.println("Factorial of 1 = " + recfactorial(1));

		System.out.println("Factorial of 10 = " + factorial(10));
		System.out.println("Factorial of 10 = " + recfactorial(10));

	//   Need fix this issues with -ve values - Swetha. 
			// System.out.println("Factorial of -10 = " + factorial(-10));
			// System.out.println("Factorial of -10 = " + recfactorial(-10));

	}
	
}
