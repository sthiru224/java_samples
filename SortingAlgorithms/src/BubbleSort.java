// import java.util.Arrays;
public class BubbleSort {
  		// Swap the places of two numbers 
		private static void sP(int i, int j, int[] myarray) {
	        int temp;
	        temp = myarray[i];
	        myarray[i] = myarray[j];
	        myarray[j] = temp;
	    }
	  
		// Print a given integer array
	    private static void printNumArray(int[] inNumArray) {
	        int k = inNumArray.length;
	        for (int i = 0; i < k; i++) {
	            System.out.print(inNumArray[i] + " ");
	        }
	        System.out.println();
	    }
	  	
	    // Bubble Sort logic to sort the elements
	    public static void doBubbleSort(int[] numarray) {
	        int n = numarray.length;
            System.out.println("Bubble Sort Iterations:");
	        
	        for (int i = 0; i<n-1; i++) {
	            for (int j = 0; j < n - 1; j++) {
	                if (numarray[j] > numarray[j + 1])
	                	sP(j, j + 1, numarray);
	            } // j loop
	            System.out.print(i + " : ");printNumArray(numarray);
	        } // i loop
	} // doBubbleSort
    

	   
    public static void main(String[] args) {
        int[] inNumArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	   // Discuss the issue with the assigning directly to take a copy
	   // int[] originalNumArray = inNumArray;
        //  int[] originalNumArray = Arrays.copyOf(inNumArray, inNumArray.length);        	
   
        // Sort with Bubble Sort
        System.out.print(" Given List : ");
        printNumArray(inNumArray);
        doBubbleSort(inNumArray);
        System.out.print(" Sorted List : ");
        printNumArray(inNumArray);

    }
}