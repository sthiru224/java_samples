public class SequentialSearch {
	
    public static boolean search(int[] a, int b){
        for (int i : a) {
            if (i==b){
                return true;
            }
        }
        return false;
    }
    
    private static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
           if (i > 0) {
              System.out.print(", ");
           }
           System.out.print(A[i]);
        }
        	System.out.println();
     }

    public static void main(String[] args) {
    			int[]a = {1, 2, 3, 4, 5, 19, 17, 7};
    			System.out.print("The given array : " );
    			printArray(a);
    			int b  = 4;
    			System.out.println("Sequential Search Results:");
    			if(search(a,b)) 
    				System.out.println("The given number " + b + " exists in the given array.");
    			else
     			System.out.println("The given number " + b + " doesn't exist in the given array.");
    			b = 10;
    			if(search(a,b)) 
    				System.out.println("The given number " + b + " exists in the given array.");
    			else
     			System.out.println("The given number " + b + " doesn't exist in the given array.");
    }
}

