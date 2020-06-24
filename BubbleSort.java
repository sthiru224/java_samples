package com.adobe.marketing.mobile.training;

public class BubbleSort {
    // Swap the places of two numbers
    private static void sP(int i, int j, int[] myarray) {
        int temp;
        temp = myarray[i];
        myarray[i] = myarray[j];
        myarray[j] = temp;
    }

    // Print a given integer array
    public static void printNumArray(int[] inNumArray) {
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

}
