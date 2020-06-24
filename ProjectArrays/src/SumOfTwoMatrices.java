
public class SumOfTwoMatrices {

	public static void main(String[] args) {
		
		
		//  Add two matrices
		
		int i,j;
		// Initialize Matrix A
		int[][] A = { {1, 2, 3},  {3, 4, 5} };
		System.out.println(" A  " + A);

		for (i = 0; i < 2; i++) {
		     for (j = 0; j < 3; j++) {
		    	 	System.out.format("%d ", A[i][j]);
		     }
		     System.out.println(); 
		}
		
		// Initialize Matrix B
		int[][] B = new int[2][3];
		for (i = 0; i < 2 ; i++) {
			for (j = 0; j < 3; j++) {
				B[i][j] = (i+1)*j;
			}
		 }	
		System.out.println(" B " + B);
		for (i = 0; i < 2; i++) {
		     for (j = 0; j < 3; j++) {
		    	 	System.out.format("%d ", B[i][j]);
		     }
		     System.out.println(); 
		}

		
		//  Finding Sum of A and B and printing the sum C
		int[][] C = new int[2][3];
		System.out.println(" C " + C);
		for (i = 0; i < 2; i++) {
	     for (j = 0; j < 3; j++) {
	    	 	C[i][j] = A[i][j]+B[i][j];
	    	 	System.out.format("%d ", C[i][j]);
	     }
	     System.out.println(); 
	}
		
		
		
			
	} //main
} //class
