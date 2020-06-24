import java.util.Arrays;
public class SelectionSort {
  		// Swap the places of two numbers 
		private static void swap(int i, int j, int[] myarray) {
	        int temp;
	        temp = myarray[i];
	        myarray[i] = myarray[j];
	        myarray[j] = temp;
	    }
	  
		// Print a given integer array
	    private static void printArr(int[] inArr) {
	          
	        for (int i = 0; i < inArr.length; i++) {
	            System.out.print(inArr[i] + " ");
	        }
	        System.out.println();
	    }
	  	
	    // Selection Sort Logic to sort the elements 
	    public static void doSelectionSort(int[] Arr){
	    		int n = Arr.length;   // n=9
		    System.out.println("Selection Sort Iterations:");
	        for (int i = 0; i < n - 1; i++)
	        {
	            int selectedIndex = i;
	            for (int j = i + 1; j <= n-1; j++) {
	            		if (Arr[j] < Arr[selectedIndex])
	            			selectedIndex = j;
	            }
	            swap(i, selectedIndex, Arr);
	            System.out.print(i + " : ");printArr(Arr);
	        }
	    } // doSelectionSort
     
	   
    public static void main(String[] args) {
        int[] inArr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	   // Discuss the issue with the assigning directly to take a copy
	   // int[] originalArr = inArr;
        int[] originalArr = Arrays.copyOf(inArr, inArr.length);        	
        // Sort with Selection Sort
        inArr = Arrays.copyOf(originalArr, originalArr.length);        	
        System.out.print(" Given List : ");
        printArr(inArr);
        doSelectionSort(inArr);
        System.out.print(" Sorted List : ");
        printArr(inArr);

   
    }
}