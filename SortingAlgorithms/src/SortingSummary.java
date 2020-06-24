public class SortingSummary{

	public static void main(String[] args) {
		System.out.println("This is the main program that compares the complexities of Sorting algorithms...");
		
		/*
		 
		 We’ve looked at five different sorting algorithms: three O(N*N) sorts (selection sort, insertion sort and bubble sort), and two
		O(NlogN) sorts (Quicksort and Merge sort). 
		
		Each sorting algorithm has its advantages and disadvantages:

		• Selection sort’s advantage is that the number of swaps is O(N), since we perform at most one data
		swap per pass through the algorithm. Its disadvantage is that it does not stop early if the list is sorted;
		it looks at every element in the list in turn.

		• Insertion Sort typically makes fewer comparisons than selection sort, it requires more writes because 
		  the inner loop can require shifting large sections of the sorted portion of the array. 
		   In general, insertion sort will write to the array O(N*N) times, whereas selection sort will write only O(N) times. 
		   For this reason selection sort may be preferable in cases where writing to memory is significantly more expensive 
		   than reading.

		• Bubble sort’s advantage is that it stops once it determines that the list is sorted. Its disadvantage is
		that it is O(N*N) in both swaps and comparisons. For this reason, bubble sort is actually the least
		efficient sorting method.

		• Quicksort is the fastest sort: it is O(NlogN) in both the number of comparisons and the number of
		swaps. The disadvantages of quicksort are that the algorithm is a bit tricky to understand, and if we
		continually select poor pivots then the algorithm can approach O(N*N) in the worst case.

		• Merge sort is as fast as quicksort: it is O(NlogN) in both swaps and comparisons. The disadvantage
		of merge sort is that it requires more copying of data from temporary lists back to the “full” list, which
		slows down the algorithm a bit.
		 
		 */
	}
}
