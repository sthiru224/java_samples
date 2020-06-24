
public class ProductOfMatrices {
	public static void main(String[] args) {
		
		
		//  Add two matrices
		
		int i,j,k,sum=0;
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
		int[][] B = new int[3][2];
		for (i = 0; i < 3 ; i++) {
			for (j = 0; j < 2; j++) {
				B[i][j] = i+j;
			}
		 }	
		System.out.println(" B " + B);
		for (i = 0; i < 3; i++) {
		     for (j = 0; j < 2; j++) {
		    	 	System.out.format("%d ", B[i][j]);
		     }
		     System.out.println(); 
		}

		
		//  Finding Product of A and B and printing the sum C
		int[][] C = new int[2][2];
		System.out.println(" C " + C);
		for (i = 0; i < 2; i++) {
	     for (j = 0; j < 2; j++) {
		     for (k = 0; k < 3; k++) {
		    	 			sum = sum + A[i][k]*B[k][j];
		     }
		     C[i][j] = sum;
		     sum=0;
	     }
	}

		System.out.println(" C " + C);
		for (i = 0; i < 2; i++) {
		     for (j = 0; j < 2; j++) {
		    	 	System.out.format("%d ", C[i][j]);
		     }
		     System.out.println(); 
		}
		
  } //main
} // class
