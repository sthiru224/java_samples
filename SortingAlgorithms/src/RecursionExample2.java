
public class RecursionExample2 {
	
	// Fibonacci sequence looks like: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ..
	// Formula : F(n) = F(n - 1) + F(n - 2) where F(0) = 1 and F(1) = 1
	
	private static int fibonacci(int num)
	{
	    // Our Base Cases
	    if(num == 0 || num == 1)
	    {
	        return 1;
	    }

	    // Our Recursive Case
	    return fibonacci(num-1) + fibonacci(num-2);
	}
	
	public static void main(String[] args) {
		System.out.println("fibonacci of 0 = " + fibonacci(0));
		System.out.println("fibonacci of 10 = " + fibonacci(10));
		// Swetha Fix the problem here
		// System.out.println("fibonacci of -10 = " + fibonacci(-10));
	}
	
}
