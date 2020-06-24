public class ContinueWithLabelDemo {
	public static void main(String[] args) {
		iloop:
			for(int i=0;i<2;i++) {
			System.out.println("i = " + i);
			jloop:		
				for (int j=0;j<3;j++) {
					System.out.print(" j = " + j);
				 	for (int k=0;k<4;k++) { 
/*	
				i = 0
				 j = 0 k = 0 k = 1 k = 2 k = 3 End of J Loop's Current Iteration
				 j = 1 k = 0 k = 1 k = 2 k = 3 End of J Loop's Current Iteration
				 j = 2 k = 0 k = 1 k = 2 k = 3 End of J Loop's Current Iteration
				End of J Loop's Current Iteration
				i = 1
				 j = 0 k = 0 k = 1 k = 2 k = 3 End of J Loop's Current Iteration
				 j = 1 k = 0 k = 1 k = 2 k = 3 End of J Loop's Current Iteration
				 j = 2 k = 0 k = 1 k = 2 k = 3 End of J Loop's Current Iteration
				End of J Loop's Current Iteration
*/
				//		 if (k > 2) continue;       // This will just ignore the rest of the statements in the k loop 
/*
						 i = 0
						 j = 0 k = 0 k = 1 k = 2 End of J Loop's Current Iteration
						 j = 1 k = 0 k = 1 k = 2 End of J Loop's Current Iteration
						 j = 2 k = 0 k = 1 k = 2 End of J Loop's Current Iteration
						End of J Loop's Current Iteration
						i = 1
						 j = 0 k = 0 k = 1 k = 2 End of J Loop's Current Iteration
						 j = 1 k = 0 k = 1 k = 2 End of J Loop's Current Iteration
						 j = 2 k = 0 k = 1 k = 2 End of J Loop's Current Iteration
						End of J Loop's Current Iteration
 */
				//		if (k > 2) continue jloop; // This will  ignore rest of the statements in J and K loops
/*
						 i = 0
						 j = 0 k = 0 k = 1 k = 2 
						 j = 1 k = 0 k = 1 k = 2 
						 j = 2 k = 0 k = 1 k = 2
						 End of J Loop's Current Iteration
						i = 1
						 j = 0 k = 0 k = 1 k = 2 
						 j = 1 k = 0 k = 1 k = 2 
						 j = 2 k = 0 k = 1 k = 2
						 End of J Loop's Current Iteration
 */
				//		  if (k > 2) continue iloop; // This will ignore rest of the statements in all I, J and K loops
						  
 /*
							i = 0
							 j = 0 k = 0 k = 1 k = 2
							i = 1
							 j = 0 k = 0 k = 1 k = 2
							 
  */
						System.out.print(" k = " + k);
					} //for k
					System.out.println(" End of J Loop's Current Iteration");
				} //for j
			System.out.println("End of J Loop's Current Iteration");
			} // for i
	}
	
}


