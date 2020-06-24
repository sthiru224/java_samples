import java.util.Arrays;
public class BinarySearch {
	
    public static boolean search(int[] a, int b){

        if (a.length == 0) {
            return false;
        }
        // Binary Search will work only with sorted array.
		Arrays.sort(a);
		System.out.print("The sorted array : " );
		printArray(a);

		int low = 0;
        int high = a.length-1;
		while(low <= high ) {
            int middle = (low+high) /2;
            if (b> a[middle] ){
                low = middle +1;
            } else if (b< a[middle]){
                high = middle -1;
            } else { // The element has been found
                return true;
            }
        }
        return false; // The element has NOT been found
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
    			int b  = 7;
    			System.out.println("Binary Search Results:");
    			
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

