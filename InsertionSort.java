package com.adobe.marketing.mobile.training;

import java.util.Arrays;
public class InsertionSort {
    // Swap the places of two numbers
    private static void sP(int i, int j, int[] myarray) {
        int temp;
        temp = myarray[i];
        myarray[i] = myarray[j];
        myarray[j] = temp;
    }

    // Print a given integer array
    public static void printNumArray(int[] inNumArray) {

        for (int i = 0; i < inNumArray.length; i++) {
            System.out.print(inNumArray[i] + " ");
        }
        System.out.println();
    }


    public static void doInsertionSort(int[] numarray){
        int n = numarray.length;
        System.out.println("Insertion Sort Iterations:");

        for (int i = 1; i < n; i++) {
            for(int j = i ; j > 0 ; j--){
                if(numarray[j] < numarray[j-1])
                    sP(j-1, j, numarray);
            }
            System.out.print(i + " : ");printNumArray(numarray);
        }
    }

}
