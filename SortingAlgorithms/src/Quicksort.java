import java.util.Arrays;
public class Quicksort {
  		// Swap the places of two numbers 
		private static void sP(int i, int j, int[] A) {
	        int temp;
	        temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	  
		// Print a given integer array
	    private static void printArray(int[] A) {
	          
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }
	        System.out.println();
	    }
	  	
	   // QuickSort  
	   public static void qS(int[] Arr, int lower, int higher) {
		  if(Arr == null | Arr.length == 0)
			 return;
		   int i=lower,j=higher;
	        int pivot = Arr[j];
	        System.out.println("pivot : " + pivot);
	        while (i <= j) {
	            while (Arr[i] < pivot) {i++;}
	            while (Arr[j] > pivot) {j--;}
	            if (i <= j) {
	            			System.out.println("Switch " + i + " with " + j);
	            			sP(i,j,Arr);
	                i++;
	                j--;
	            }
	            printArray(Arr);
	        }
         // call qS() method recursively
	        if (lower < j) {
	        		System.out.println("Calling qS with lower = " + lower + " j = "+j);
	        		qS(Arr,lower, j);
	        }
	        if (i < higher) {
        		System.out.println("Calling qS with i = " + i + " higher = "+higher);
	        		qS(Arr,i, higher);
	        }
	    } //qS

	   
    public static void main(String[] args) {
        int[] A = {7,2,1,6,8,5,3,4};
        int[] backupOfA = Arrays.copyOf(A, A.length);        	

        // Sort with Quick Sort
        A = Arrays.copyOf(backupOfA, backupOfA.length);        	
        System.out.print(" Given List : ");
		  if(A == null | A.length == 0)
			 System.out.println("The given list is empty");
			 else 
		     printArray(A);
		  
  		  if(!(A == null | A.length == 0)) {
  		      qS(A,0,A.length-1);
  		      System.out.print(" Sorted List : ");
  		      printArray(A);
  		  }
    
    }
}